package dayTwo;

/**
 * Die Duck-Klasse soll eine Abstraktion einer Ente darstellen. Daher leitet sie von der
 * Animal-Klasse ab. Und implementiert sowohl das Interface Flyable, um fliegen zu können - mittels
 * der Methode fly(), als auch Swimmable, um schwimmen zu konnen mittels der Methode swim().
 */
public class Duck extends Animal implements Swimmable, Flyable {

    /*
     * Die Duck-Klaase "überschreibt" die fly()-Mehtode des Interfaces. Hier unterscheided Java
     * nicht zwischen dem echten überschreiben der Methode einer Superklasse oder der
     * Implementierung einer Methode eines zu implementierenden Interfaces.
     */
	@Override
	public void fly() {
		System.out.println("The duck goes flap, flap, flap");
	}

    /*
     * Die Duck-Klaase "überschreibt" die swim()-Mehtode des Interfaces. Hier unterscheided Java
     * nicht zwischen dem echten überschreiben der Methode einer Superklasse oder der
     * Implementierung einer Methode eines zu implementierenden Interfaces.
     */
	@Override
	public void swim() {
		System.out.println("The duck paddles around.");
	}

}
