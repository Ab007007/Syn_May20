package com.dummy;

public class AnimalManager {

	
	public static void main(String[] args) {
		
		Cat c  =  new Cat();
		Dog d  = new Dog() 
		{
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("it will only bite");
			}
		};
		
		c.eat();
		d.eat();
	}
}
