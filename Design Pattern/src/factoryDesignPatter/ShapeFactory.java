package factoryDesignPatter;

public class ShapeFactory {
	
	public Shape createShape(String input) {
		if(input.equals("Circle")) {
			return new Circle();
		}
		
		else if(input.equals("Square")) {
			return new Square();
		}
		
		else {
			throw new IllegalArgumentException("Unsupported shape type");
		}
	}

}
