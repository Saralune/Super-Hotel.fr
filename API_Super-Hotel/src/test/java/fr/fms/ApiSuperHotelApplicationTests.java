package fr.fms;

import fr.fms.business.CityBusinessImpl;
import fr.fms.entities.City;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class ApiSuperHotelApplicationTests {
	@Autowired
	CityBusinessImpl cityBusiness;

	@Test
	void contextLoads() {
		assertFalse(1 == 2);
	}

//	@Test
//	void testAddOne(){
//		City toulouse = new City(123L, "Toulouse", "31000", "France", null);
//
//		cityBusiness.saveOrUpdateOne(toulouse);
//
//		assertEquals(toulouse, cityBusiness.readOneById(123L).get());
//	}

	@Test
	void testGetArticleDeleted() {
		City toulouse = new City(123L, "Toulouse", "31000", "France", null);
		try {
			cityBusiness.saveOrUpdateOne(toulouse);
			cityBusiness.deleteOne(123L);
			assertThat(cityBusiness.readOneById((long) 123).get()).isNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
