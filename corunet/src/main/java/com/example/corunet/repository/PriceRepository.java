package com.example.corunet.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.corunet.entity.Price;

public interface PriceRepository extends CrudRepository<Price, Integer>{
	
	List<Price> findByProductIdAndBrandIdAndStartDateLessThanAndEndDateGreaterThanOrderByPriorityDesc(Integer productId, Integer brandId, Timestamp timestamp, Timestamp timestamp2);

}
