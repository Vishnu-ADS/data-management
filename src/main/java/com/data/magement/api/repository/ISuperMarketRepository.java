package com.data.magement.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.data.magement.api.data.entity.SuperMarket;

public interface ISuperMarketRepository extends MongoRepository<SuperMarket, String> {

	List<SuperMarket> findByNameIgnoreCaseAndAddressIgnoreCase(String marketName, String address);
	List<SuperMarket> findByNameIgnoreCase(String marketName);

	

}
