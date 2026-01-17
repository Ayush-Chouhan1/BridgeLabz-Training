package com.generics.smartwarehousemanagementsystem;

public class TestWarehouse {
	
	public static void main(String[] args) {
		
		Storage<Electronics> electrnoicStorage = new Storage<>();
		electrnoicStorage.addItem(new Electronics("Laptop", 198000));
		electrnoicStorage.addItem(new Electronics("Phone", 145000));
		
		Storage<Groceries> groceriesStorage = new Storage<>();
		groceriesStorage.addItem(new Groceries("milk", 34));
		groceriesStorage.addItem(new Groceries("Rice", 1500));
		
		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture("Sofa", 99000));
		furnitureStorage.addItem(new Furniture("Cubboard", 85000));
		
		WarehouseUtil.displayAllItems(electrnoicStorage.getAllItems());
		WarehouseUtil.displayAllItems(groceriesStorage.getAllItems());

		WarehouseUtil.displayAllItems(furnitureStorage.getAllItems());

		
	}

	
}
