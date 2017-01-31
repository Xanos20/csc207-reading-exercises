
public class Dog {
	
	public String name;
	public int age;
	public String breed;
	public boolean barks;
	
	
	
	public Dog (String name, int age, String breed, boolean barks) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.barks = barks;
	}
	
	public void bark() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println(this.barks);
	}
	
	
	
	
	public static void main(String[] args) {
		String name = "Puddles";
		int age = 7;
		String breed = "Lab";
		boolean barks = true;
		
		 Dog myDog = new Dog (name, age, breed, barks);
		 myDog.bark();
		
	}
	
	

}
