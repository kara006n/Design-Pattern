package factoryDesignPatter;

public class Main {
	
	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		// Create a circle
        Shape circle = factory.createShape("Circle");
        circle.draw(); // Output: Drawing a circle
        
        // Create a square
        Shape square = factory.createShape("Square");
        square.draw(); // Output: Drawing a square
	}

}
