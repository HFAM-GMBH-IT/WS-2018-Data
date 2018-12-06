package dayTwo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Dies ist eine ganz gewöhnliche Klasse. Sie liegt zwar im gleichen Paket wie die Klasse Bee, aber
 * nicht im gleichen Verzeichnis. So kann sie auf nicht private Eigenschaften der Bee-Klasse
 * zugreifen, kann aber recht einfach von einem Deployment ausgeschlossen werden indem ihr ganzer
 * Verzeichnispfad ignoriert wird.
 */
public class BeeTest {
	
    /*
     * Methoden der Bee-Klasse wollen wir testen, also instanziieren wir ein Testobjekt dieser
     * Klasse.
     */
	Bee theBee = new Bee();

    /*
     * Diese Annotation aus der JUnit-Bibliothek definiert die folgende Methode als Test. Der Name
     * der Methode spielt dabei keine Rolle.
     */
	@Test
	public void test() {
        // given
		int beesHight = theBee.getAltitude();

        // when
		theBee.fly();

        /*
         * Der eigentliche Test findet hier statt. Nach dem Aufsetzen der Testdaten (in given) und
         * dem Ausführen einer Methode unserer zu testenden Klasse (in when) erwarten wir ein
         * Ergebnis. Hier: die Höhe der Biene soll sich geändert haben.
         */
        // then
		assertTrue(beesHight < theBee.getAltitude());
	}

}
