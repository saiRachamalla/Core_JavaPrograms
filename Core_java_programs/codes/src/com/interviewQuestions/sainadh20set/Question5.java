package com.interviewQuestions.sainadh20set;
class Animal{
	void makeSound() {
		System.out.println("animals make sound loudly");
	}
}
class Lion extends Animal{
	@Override
	void makeSound() {
		System.out.println("Lion makes sound like roaring");
	}
}
class Monkey extends Animal{
	@Override
	void makeSound() {
		System.out.println("Monkey makes sounf like chatter");
	}
}
class sounds{
	void permit(Animal ref) {
		ref.makeSound();
	}
}
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lion l=new Lion();
Monkey m=new Monkey();
sounds s=new sounds();
System.out.println("Lion Sound:");
s.permit(l);
System.out.println("Monkey sound:");
s.permit(m);
	}

}