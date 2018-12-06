package dayTwo;

/**
 * Die App-Klasse ist die Klasse, die das Hauptprogramm stellt. Das erkennt man an der Signatur der
 * main()-Methode: public static void main(String[] args)
 */
public class App {

	public static void main(String[] args) {
        /*
         * Hier wird der Variablen queen die Adresse eines Bee-Objekts zugewiesen. Daher ist diese
         * Variable auch vom Typ Bee.
         */
		Bee queen = new Bee();
        /**
         * Bienenköniginnen können brüten...
         */

		queen.breed();
        /**
         * ... und fliegen.
         */
		queen.fly();
	}

}
