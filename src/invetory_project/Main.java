package invetory_project;

public class Main {
	public static void main(String[] args) {
		StoreManager storemanager = new StoreManager();
		StoreCapable storage = new PersistenStore();
		storemanager.addStorage(storage);
		storemanager.addCDProduct("Michael Jackson", 1450, 18);
		storemanager.addBookProduct("Harry Potter", 4570, 150);
		storemanager.addCDProduct("Nickelback", 1000, 20);
		storemanager.addBookProduct("Star Wars", 2000, 180);
		System.out.println(storemanager.listProducts());
		System.out.println(storemanager.getTotalProductPrice());
	}
}
