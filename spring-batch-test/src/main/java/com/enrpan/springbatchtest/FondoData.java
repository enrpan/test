package com.enrpan.springbatchtest;

public class FondoData {

	private String name;
	private Double value;

	public FondoData(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "FondoData [name=" + name + ", value=" + value + "]";
	}

}
