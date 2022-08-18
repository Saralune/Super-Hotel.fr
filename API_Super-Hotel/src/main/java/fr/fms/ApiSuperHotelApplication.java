package fr.fms;

import fr.fms.business.CityBusinessImpl;
import fr.fms.business.HotelBusinessImpl;
import fr.fms.business.UsersBusinessImpl;
import fr.fms.entities.City;
import fr.fms.entities.Hotel;
import fr.fms.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiSuperHotelApplication implements CommandLineRunner {
	@Autowired
	private CityBusinessImpl cityBusiness;

	@Autowired
	private HotelBusinessImpl hotelBusiness;

	@Autowired
	private UsersBusinessImpl usersBusiness;

	public static void main(String[] args) {
		SpringApplication.run(ApiSuperHotelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataCreation();
	}

	public void dataCreation(){
		City toulouse = new City("Toulouse", "31000", "France");
		City bourges = new City("Bourges", "18000", "France");
		City bayonne = new City("Bayonne", "40000", "France");

		cityBusiness.saveOrUpdateOne(toulouse);
		cityBusiness.saveOrUpdateOne(bourges);
		cityBusiness.saveOrUpdateOne(bayonne);

		Users test = new Users(null, "mail@test.com", "123", "test", true);

		usersBusiness.saveOrUpdateOne(test);

		Hotel toulouse1 = new Hotel("Hôtel de la plage","0534345002", "12 rue de la plage", 5, "vancouver_en_france.jpg", 2, 105.5, toulouse, test);
		Hotel toulouse2 = new Hotel("Hôtel par là bas","0534345002", "12 rue d'ici", 3, "singapore_en_france.jpg", 20, 10.5, toulouse, test);
		Hotel toulouse3 = new Hotel("Le Capitole","0534377002", "123 place du Capitole", 5, "capitole.jpg", 1, 1000.99, toulouse, test);
		Hotel bourges1 = new Hotel("Le marais","0248345002", "10 rue du marais", 4, "salon_the.jpg", 6, 233, bourges, test);
		Hotel bourges2 = new Hotel("La Cathédrale","0248345011", "place de la Cathédrale Saint-Etienne", 5, "bourges.jpg", 600, 26, bourges, test);

		hotelBusiness.saveOrUpdateOne(toulouse1);
		hotelBusiness.saveOrUpdateOne(toulouse2);
		hotelBusiness.saveOrUpdateOne(toulouse3);
		hotelBusiness.saveOrUpdateOne(bourges1);
		hotelBusiness.saveOrUpdateOne(bourges2);
	}
}
