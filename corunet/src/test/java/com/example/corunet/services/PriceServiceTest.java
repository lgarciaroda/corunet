package com.example.corunet.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.corunet.entity.Price;
import com.example.corunet.services.impl.PriceServiceImpl;

@SpringBootTest
public class PriceServiceTest {
	
	private static final Integer PRODUCT_ID = 35455;
	private static final Integer BRAND_ID = 1;
	private static final String DATE = "2020-06-14 10:00:00";
	private static final String DATE2 = "2020-06-14 16:00:00";
	private static final String DATE3 = "2020-06-14 21:00:00";
	private static final String DATE4 = "2020-06-15 10:00:00";
	private static final String DATE5 = "2020-06-16 21:00:00";
	
	@Autowired
	private PriceServiceImpl priceServiceImpl;

	@Test
	public void getPrecio1() {
		final Price response = priceServiceImpl.getPrecio(PRODUCT_ID, BRAND_ID, DATE);
		Assertions.assertEquals(response.getPriceListId(), 1);
	}
	
	@Test
	public void getPrecio2() {
		final Price response = priceServiceImpl.getPrecio(PRODUCT_ID, BRAND_ID, DATE2);
		Assertions.assertEquals(response.getPriceListId(), 2);
	}
	
	@Test
	public void getPrecio3() {
		final Price response = priceServiceImpl.getPrecio(PRODUCT_ID, BRAND_ID, DATE3);
		Assertions.assertEquals(response.getPriceListId(), 1);
	}
	
	@Test
	public void getPrecio4() {
		final Price response = priceServiceImpl.getPrecio(PRODUCT_ID, BRAND_ID, DATE4);
		Assertions.assertEquals(response.getPriceListId(), 3);
	}
	
	@Test
	public void getPrecio5() {
		final Price response = priceServiceImpl.getPrecio(PRODUCT_ID, BRAND_ID, DATE5);
		Assertions.assertEquals(response.getPriceListId(), 4);
	}
}
