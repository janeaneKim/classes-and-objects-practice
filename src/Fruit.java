//this is a custom class:
public class Fruit {
	private String color;
	private String name;
	private String sweetLevel;
	
	//Constructors
	public Fruit() {
		
	}
	
	public Fruit (String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public Fruit (String color, String name, String sugarLevel) {
		this.color = color;
		this.name = name;
		this.sweetLevel = sugarLevel;
	}
	
	//getters
	public String getColor () {
		return color;
	}
	
	public String getname () {
		return name;
	}
	
	public String getSweetLevel() {
		return sweetLevel;
	}
	
	//setters
	public void setColor (String color) {
		this.color = color;
	}
	
	public void setname (String name) {
		this.name = name;
	}
	
	public void setSweetLevel(String sugarLevel) {
		this.sweetLevel = sugarLevel;
	}
	
	//method that returns a boolean
	public boolean isRed() {
		return true;
	}
	
	//method that returns a string
	public String description() {
		return "Wow, this " + name + " is " + color + " and tastes " + sweetLevel ;
	}
	
	public static void main(String[]args) {
		Fruit apple = new Fruit("red", "apple", "very sweet");
		System.out.println(apple.description());
		System.out.println("Is this " + apple.name + " red? " + apple.isRed());
	}

}
