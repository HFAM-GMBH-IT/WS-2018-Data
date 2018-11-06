package dayTwo;

public class Duck extends Animal implements Swimmable, Flyable {

	@Override
	public void fly() {
		System.out.println("The duck goes flap, flap, flap");
	}

	@Override
	public void swim() {
		System.out.println("The duck paddles around.");
	}

}
