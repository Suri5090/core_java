package com.practice;

public class EnumDemo {

	private Fruit fruit;
	
	public EnumDemo(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public void getFruitDescription()
	{
		switch(fruit) {
			case GRAPE:
					System.out.println("A grape is a non-climacteric fruit.");
					break;
			default:
					System.out.println("No desc available.");
		}
	}
	public static void main(String[] args) {
		EnumDemo ed = new EnumDemo(Fruit.GRAPE);
		ed.getFruitDescription();
	}
}
enum Fruit{
	GRAPE, APPLE, MANGO, LEMON;
}