package com.example.corunet.controllers;

import com.example.corunet.entity.Price;

public interface PriceController {
	
	public Price getPrecio(Integer productId, Integer brandId, String date);
	
}
