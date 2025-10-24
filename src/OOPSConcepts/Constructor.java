package OOPSConcepts;


class Parent
{
	private String name;
	private int age;
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
		}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName() {
		this.name=name;
	}
	
	public void setAge() {
		this.age=age;
	}
}


public class Constructor {

	public static void main(String[] args) {
		Parent p = new Parent("Prajakta", 27);
		System.out.println("Name:"+p.getName() +" and Age is: "+p.getAge());

	}

}
