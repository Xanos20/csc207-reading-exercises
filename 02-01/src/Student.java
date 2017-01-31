/**
 * 
 * @author kamalnadesan
 *
 * New object named Student that has four fields that incude the first and last name (in strings), and the id and age in integers
 * 
 */
public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private int age;

	public Student(String firstName, String lastName, int age, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.id = id;
	}
	
	/**
	 * Gets the firstName field of an object Student
	 * @return String firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Gets the lastName field of an object Student
	 * @return String lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * Gets the id field of an object Student
	 * @return int id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Gets the age field of an object Student
	 * @return int age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Modifies the firstName field of an object Student
	 * @param firstname
	 */
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	/**
	 * Modifies the lastName field of an object Student
	 * @param String lastname
	 */
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	
	/**
	 * Modifies the id field of an object Student
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Modifies the age field of an object Student 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
		System.out.println(this.age);
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Student daMan = new Student("Kamal", "Nadesan", 20, 23);
		System.out.println(daMan.getId());
		
	}
	


}