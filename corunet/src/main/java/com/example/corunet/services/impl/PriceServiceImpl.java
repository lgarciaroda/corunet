package com.example.corunet.services.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.corunet.entity.Price;
import com.example.corunet.repository.PriceRepository;
import com.example.corunet.services.PriceService;

@Service
public class PriceServiceImpl implements PriceService {
	
	@Autowired
	private PriceRepository priceRepository;

	@Override
	public Price getPrecio(Integer productId, Integer brandId, String date) {
		Timestamp timestamp = Timestamp.valueOf(date);
		List<Price> precios = priceRepository.findByProductIdAndBrandIdAndStartDateLessThanAndEndDateGreaterThanOrderByPriorityDesc(productId, brandId, timestamp, timestamp);
		
		return precios.get(0);
	}
	
	

}
