package com.data.magement.api.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.data.magement.api.controller.model.SuperMarketModel;
import com.data.magement.api.data.entity.SuperMarket;
import com.data.magement.api.repository.ISuperMarketRepository;

@Component
public class SuperMarketManager {

	@Autowired
	private ISuperMarketRepository superMarketRepository;

	public SuperMarket createAndUpdateSuperMarket(SuperMarketModel marketModel) {
		SuperMarket superMarket = new SuperMarket();
		if (marketModel.getId() != null && !marketModel.getId().isEmpty()) {
			superMarket.setId(marketModel.getId());
		}
		superMarket.setName(marketModel.getName());
		superMarket.setAddress(marketModel.getAddress());
		return superMarketRepository.save(superMarket);
	}

	public List<SuperMarket> getTheSuperMarketByNameAndAddress(String marketName, String address) {

		List<SuperMarket> list = new ArrayList<>();
		if (address != null && !address.isEmpty()) {
			list = superMarketRepository.findByNameIgnoreCaseAndAddressIgnoreCase(marketName, address);
		}
		list = superMarketRepository.findByNameIgnoreCase(marketName);
		return list;
	}

}
