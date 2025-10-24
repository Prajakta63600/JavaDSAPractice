package OOPSConcepts;

class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}
}

public class Constructor2 {

	public static void main(String[] args) {
		Dog d = new Dog("Jokky", "Labb");
		System.out.println(d.getName()+" is "+d.getBreed());
		System.out.println("After updating value");
		d.setName("Puppy");
		d.setBreed("Rott");
		System.out.println(d.getName()+" is "+d.getBreed());
		

	}

}
