package kr.s15.object.thistest;

public class Animal {
	private String name;
	private int age;
	private boolean fly;
	
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	
	public Animal() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	
}
