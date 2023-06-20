package com.data.magement.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.magement.api.controller.model.SuperMarketModel;
import com.data.magement.api.data.entity.SuperMarket;
import com.data.magement.api.manager.SuperMarketManager;

@RestController
@RequestMapping("/super_market")
public class SuperMarketController {
	
	@Autowired
	private SuperMarketManager SuperMarketManager; 
	
	@PutMapping
	public SuperMarket createAndUpdateSuperMarket(@RequestBody SuperMarketModel marketModel) {
		return SuperMarketManager.createAndUpdateSuperMarket(marketModel);
	}

	@GetMapping("/by-name")
	public List<SuperMarket> getTheSuperMarketByNameAndAddress(@RequestParam("name") String marketName,
			@RequestParam(required = false, value = "address") String address) {
		return SuperMarketManager.getTheSuperMarketByNameAndAddress(marketName, address);

	}
	
	

}
