package dayTwo;

public class Bee extends Animal implements Flyable {
	
	int altitude;

	@Override
	public void fly() {
		System.out.println("I feel so FREEEEEE!");
		altitude++;
		altitude = altitude + 1;
		altitude += 1;
	}
	
	protected int getAltitude() {
		return altitude;
	}
	
}
