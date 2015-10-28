package web;

import java.io.IOException;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraping {
	// 1. Definición de variables
	private static final Logger logger = LogManager.getLogger();	
	private static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_0) "
			+ "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.80 Safari/537.36";
	
	public static void main(String[] args) throws IOException {
		// 2. Hashmap que guardará resultados 
		HashMap<String,String> articleMap = new HashMap<String, String>();
		
		/* 3. Crea documento jsoup con pretendiendo 
		 * que el navegador es chrome
		 * */
		Document doc = Jsoup.connect("http://jose-manuel.me/").userAgent(USER_AGENT).get();
		
		/* 4. Obtiene los tags "argticle" dentro de una
		 * Elements que tiene como superclase List 
		 * */
		Elements articles = doc.select("article");
		logger.info("Artículos encontrados: {}", articles.size());
		
		/* 5. Por cada elemento en articles
		 * busca el elemento <header> y selecciona
		 * el elemento <a>
		 * */
		for (Element article: articles){
			Elements aLink = article.select("header").select("a");
			// Accede al texto del tag <a>
			String title = aLink.text();
			// Accede al atributo de <a> href
			String link = aLink.attr("href");
			// Guarda los elementos en el HasMap
			articleMap.put(link, title);
		}
		// 6. Imprime el HashMap con funcion lamda
		articleMap.forEach((k, v) -> System.out.println("Artículo: "+ v + ", URL:" + k));
	}
}
