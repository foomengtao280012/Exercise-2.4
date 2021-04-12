
public class Main {

	public static void main(String[] args) {
		Pen MyPen = new Pen();
		
		MyPen.setColour("Blue");
		MyPen.setSize(0.5);
		MyPen.setType("Gel Pen");
		MyPen.setWeight(0.2);
		
		System.out.println("=======My Pen=======");
		System.out.println("Colour: " + MyPen.getColour());
		System.out.println("Size: " + MyPen.getSize() + "mm");
		System.out.println("Type: " + MyPen.getType());
		System.out.println("Weight: " + MyPen.getWeight() +"kg");
		
		Pen AbuPen = new Pen();
		AbuPen.setColour("Black");
		AbuPen.setSize(0.7);
		AbuPen.setType("Ballpoint Pen");
		AbuPen.setWeight(0.4);
		
		System.out.println("\n=======Abu Pen=======");
		System.out.println("Colour: " + AbuPen.getColour());
		System.out.println("Size: " + AbuPen.getSize() + "mm");
		System.out.println("Type: " + AbuPen.getType());
		System.out.println("Weight: " + AbuPen.getWeight() +"kg");

	}

}
