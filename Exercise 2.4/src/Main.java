
public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		
		phone1.setBrand("Huawei");
		phone1.setModel("Mate 40 Pro");
		phone1.setOS("Android");
		phone1.setRAM(8);
		phone1.setWeight(212);
		
		System.out.println("=======Phone1=======");
		System.out.println("Brand: " + phone1.getBrand());
		System.out.println("Model: " + phone1.getModel());
		System.out.println("OS: " + phone1.getOS());
		System.out.println("RAM: " + phone1.getRAM() +"GB");
		System.out.println("Weight: " + phone1.getWeight() +"g");
		
		Phone phone2 = new Phone();
		phone2.setBrand("Apple");
		phone2.setModel("iPhone 12 Pro");
		phone2.setOS("iOS");
		phone2.setRAM(6);
		phone2.setWeight(189);
		
		System.out.println("\n=======Phone2=======");
		System.out.println("Brand: " + phone2.getBrand());
		System.out.println("Model: " + phone2.getModel());
		System.out.println("OS: " + phone2.getOS());
		System.out.println("RAM: " + phone2.getRAM() +"GB");
		System.out.println("Weight: " + phone2.getWeight() +"g");

	}

}
