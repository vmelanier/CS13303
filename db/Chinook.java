package db;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

import java.util.List;

public class Chinook {
	public static void main(String[] args) {
		/* 
		 * A. Crea y persiste dos objetos de 
		 *    tipo Artist
		 * */
		// 1. Inicializa la fábrica de sesiones
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		// 2. Abre la sessión
		Session session = sessionFactory.openSession();
		
		// 3. Crea objetos a persistir
		Artist artist1 = new Artist();
		Artist artist2 = new Artist();
		
		artist1.setName("Steven Wilson");
		artist1.setArtistId(276);
		artist2.setName("Porcupine Tree");
		artist2.setArtistId(277);
		
		// 4. Inicia la transacción
		session.beginTransaction();
		// 5. Guarda los objetos de tipo Artist previamente creados
		session.save(artist1);
		session.save(artist2);
		// 6. Escribe los datos
		session.getTransaction().commit();
		
		/*
		 * B. Consulta la base de datos
		 *    para buscar los objetos 
		 *    previamente persistidos
		 * */
		// 1. Crea un objeto query a partir del metodo createQuery()
		Query query = session.createQuery("from Artist where ArtistId in (276, 277)" );
		
		// 2. Obtiene los resultados en una lista
		List<?> resultados = query.list();
		System.out.format("Resultados: %s\n", resultados.size());
		
		// 3. Imprime cada uno de los elementos dentro de resultados 
		resultados.forEach(System.out::println);
		
		// 4. Crea dos objetos y hace casting del elemento 0 y 1 a Artist
		Artist artist1DB = (Artist) resultados.get(0);
		Artist artist2DB = (Artist) resultados.get(1);
		
		System.out.format("Artista: %s, id: %s", artist1DB.getName(), artist1DB.getArtistId());
		System.out.format("Artista: %s, id: %s", artist2DB.getName(), artist2DB.getArtistId());
		
		session.close();
		sessionFactory.close();
		
	}

}
