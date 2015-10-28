package lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

public class RESTClient {
	// 1. Definición de variables estáticas
	private static Gson gson = new Gson();
	private static final Logger logger = LogManager.getLogger();
	private static final String URL_API_ROOT = "http://jsonplaceholder.typicode.com/";

	/* 6.
	 * Método main para realizar el consumo 
	 * de los REST services
	 * */
	public static void main(String[] args) throws IOException {
		Post[] posts = (Post[]) getResourceCollection(Resource.POSTS);
		Comment[] comments = (Comment[]) getResourceCollection(Resource.COMMENTS);
		Post post1 = (Post) getResourceItem(Resource.POSTS, 1);
		Comment comment1 = (Comment) getResourceItem(Resource.COMMENTS, 1);
		logger.info("Posts encontrados: {}", posts.length);
		logger.info("Comments encontrados: {}", comments.length);
		logger.info("Obteniendo post en objeto: {}", post1);
		logger.info("Obteniendo comment en objeto: {}", comment1);
		logger.info("Transformando post a JSON: {}", gson.toJson(post1));
		logger.info("Transformando comment en JSON: {}", gson.toJson(comment1));

	}
	
	/* 2.
	 * Tipos de Recursos en el REST service
	 * http://jsonplaceholder.typicode.com/
	 * */
	public enum Resource {
		POSTS, COMMENTS, ALBUMS, PHOTOS, TODOS, USERS;
	};

	/* 3.
	 * Método para obtener la colección de recursos
	 * y devolver un arreglo arbitrario de objetos
	 * */
	public static Object[] getResourceCollection(Resource resource)
			throws MalformedURLException{
		String response = getURL(URL_API_ROOT + resource.name(),
				"GET");
		switch (resource.name()){
		case "POSTS":
			Post[] posts = gson.fromJson(response, Post[].class);
			return posts;
		case "COMMENTS":
			Comment[] comments = gson.fromJson(response, Comment[].class);
			return comments;
		default:
			return null;
		}
	}

	/* 4. 
	 * Método para obtener un elemento de recursos
	 * y devolver un objeto arbitrario
	 * */
	public static Object getResourceItem(Resource resource, int itemId) 
			throws MalformedURLException{
		String url = String.format("%s%s/%s", URL_API_ROOT, resource.name(), itemId );
		String response = getURL(url, "GET");
		switch (resource.name()){
		case "POSTS":
			Post post = gson.fromJson(response, Post.class);
			return post;
		case "COMMENTS":
			Comment comment = gson.fromJson(response, Comment.class);
			return comment;
		default:
			return null;
		}
	}

	/* 5. 
	 * Método para obtener el resultado de una solicitud
	 * GET a un URI especifico
	 * */
	public static String getURL(String url, String requestMethod){
		HttpURLConnection connection;
		try {
			URL resource = new URL(url);
			connection = (HttpURLConnection) resource.openConnection();
			connection.setRequestMethod(requestMethod);
			connection.connect();
			logger.warn("Response code: {}", connection.getResponseCode());

			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(connection.getInputStream()));){
				StringBuilder response = new StringBuilder();
				String inputLine;
				while ((inputLine = in.readLine()) != null) 
					response.append(inputLine);
				if (in != null){
					in.close();
				}
				connection.disconnect();
				return response.toString();
			}catch (Exception ex){
				logger.error(ex);
			} finally {
				if (connection != null)
					connection.disconnect();
			}
		} catch (Exception ex){
			logger.error(ex);
		}
		return null;
	}
}
