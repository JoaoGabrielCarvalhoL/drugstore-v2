package br.com.carv.drugstore.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.carv.drugstore.entities.Manufacturer;

public class ManufacturerDaoTest {
	
	@Test
	public void save() {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setManufacturerName("João Gabriel");
		manufacturer.setDescription("Development LTDA");
		
		ManufacturerDao manufacturerDao = new ManufacturerDao(); 
		manufacturerDao.save(manufacturer);
	}
	
	@Test
	public void listAll() {
		
		List<Manufacturer> manufactures = new ArrayList<Manufacturer>();
		
		ManufacturerDao manufacturerDao = new ManufacturerDao(); 
		manufactures = manufacturerDao.listAll();
		
		for (Manufacturer m : manufactures) {
			System.out.println(m);
		}
	
	}



}
