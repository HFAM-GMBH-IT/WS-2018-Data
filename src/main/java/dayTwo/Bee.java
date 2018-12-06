package dayTwo;

/**
 * Die Bee-Klasse soll eine Abstraktion einer Biene darstellen. Daher leitet sie von der
 * Animal-Klasse ab. Und implementiert das Interface Flyable, um fliegen zu können - mittels der
 * Methode fly().
 */
public class Bee extends Animal implements Flyable {

    /*
     * Eine Biene hat eine Flughöhe.
     */
	int altitude;

    /*
     * Die Bee-Klaase "überschreibt" die fly()-Mehtode des Interfaces. Hier unterscheided Java nicht
     * zwischen dem echten überschreiben der Methode einer Superklasse oder der Implementierung
     * einer Methode eines zu implementierenden Interfaces.
     */
	@Override
	public void fly() {
		System.out.println("I feel so FREEEEEE!");
		altitude++;
		altitude = altitude + 1;
		altitude += 1;
	}
	
    /**
     * Liefere die Höhe der Biene.
     * @return
     */
	protected int getAltitude() {
		return altitude;
	}
	
}
