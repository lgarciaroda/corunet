package com.example.corunet.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.corunet.controllers.PriceController;
import com.example.corunet.entity.Price;
import com.example.corunet.services.PriceService;
import com.example.corunet.utils.RestConstants;

@RestController
public class PriceControlerImpl implements PriceController {
	
	@Autowired
	private PriceService priceService;

	@Override
	@GetMapping(value = RestConstants.RESOURCE_PRICE + RestConstants.RESOURCE_PRODUCT_ID + "/{" + RestConstants.PRODUCT_ID + "}"
			+ RestConstants.RESOURCE_BRAND_ID + "/{" + RestConstants.BRAND_ID + "}"
			+ RestConstants.RESOURCE_DATE + "/{" + RestConstants.DATE + "}")
	public Price getPrecio(
			@PathVariable(RestConstants.PRODUCT_ID) final Integer productId,
			@PathVariable(RestConstants.BRAND_ID) final Integer brandId,
			@PathVariable(RestConstants.DATE) final String date) {
		
		return priceService.getPrecio(productId, brandId, date);
	}
}
