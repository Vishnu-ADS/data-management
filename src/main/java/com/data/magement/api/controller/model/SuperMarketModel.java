package com.data.magement.api.controller.model;

public class SuperMarketModel {

	public SuperMarketModel(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public SuperMarketModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String id;
	private String name;
	private String address;

}
