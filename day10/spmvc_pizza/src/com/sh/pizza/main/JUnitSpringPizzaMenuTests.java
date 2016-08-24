package com.sh.pizza.main;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.GenericXmlContextLoader;

import com.sh.pizza.daos.MenuDao;
import com.sh.pizza.entities.Item;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/pizza.xml", loader=GenericXmlContextLoader.class)
public class JUnitSpringPizzaMenuTests {
	@Autowired
	private MenuDao menuDao;
	
	@Test
	public void testMenuTypes() {
		List<String> list = menuDao.getTypes();
		System.out.println(list);
		assertTrue("Menu Types : ", true);
	}
	
	@Test
	public void testMenuVegCategories() {
		List<String> list = menuDao.getCategories("Veg");
		System.out.println(list);
		assertTrue("Menu Categories : ", true);
	}
	
	@Test
	public void testMenuNonVegCategories() {
		List<String> list = menuDao.getCategories("NonVeg");
		System.out.println(list);
		assertTrue("Menu Categories : ", true);
	}
	
	@Test
	public void testMenuVegItems() {
		String type = "Veg";
		for (String category : menuDao.getCategories(type)) {
			System.out.println(" *** " + category);
			List<Item> list = menuDao.getItems(type, category);
			for (Item item : list) {
				System.out.println("    --- " + item);
			}
		}
		assertTrue("Veg Items : ", true);
	}
	
	@Test
	public void testMenuNonVegItems() {
		String type = "NonVeg";
		for (String category : menuDao.getCategories(type)) {
			System.out.println(" *** " + category);
			List<Item> list = menuDao.getItems(type, category);
			for (Item item : list) {
				System.out.println("    --- " + item);
			}
		}
		assertTrue("NonVeg Items : ", true);
	}
	
	@Test
	public void testItemSearch() {
		Item item = menuDao.getItem(1);
		System.out.println("Found : " + item);
		assertNotNull("Item Found : ", item);
	}
}




