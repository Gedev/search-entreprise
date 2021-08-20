package gedev.technobel.searchentreprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class SearchEntrepriseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchEntrepriseApplication.class, args);

		try {
			String url = "jdbc:mariadb://localhost:3306/search-entreprise";
			String user = "root";
			String password = "";

			DriverManager.getConnection(url, user, password);
			System.out.println("Connection has been successfully established with the database !");

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		};
	}
}
