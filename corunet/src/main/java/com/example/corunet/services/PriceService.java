package com.example.corunet.services;

import com.example.corunet.entity.Price;

public interface PriceService {
	
	public Price getPrecio(Integer productId, Integer brandId, String date);
	
}
