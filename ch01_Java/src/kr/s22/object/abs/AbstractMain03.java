package kr.s22.object.abs;

abstract class Animal{
	public void breathe() {
		System.out.println("숨을 쉬다");
	}
	//추상메서드
	public abstract void sound();
}
//자식클래스
class Dog extends Animal{
	//Animal 의 추상메서드 sound 를 의무적으로 구현해줘야함
	@Override
	public void sound() {
		System.out.println("개는 멍멍멍~~~");
	};
}
class Cat extends Animal{
	//Animal 의 추상메서드 sound 를 의무적으로 구현해줘야함
	@Override
	public void sound() {
		System.out.println("고양이는 야옹야옹~~");
	};
}

public class AbstractMain03 {
	public static void main(String[] args) {
		 Dog d = new Dog();
		 d.breathe();
		 d.sound();
		 System.out.println("------------");
		 
		 Cat c = new Cat();
		 c.breathe();
		 c.sound();
	}
}