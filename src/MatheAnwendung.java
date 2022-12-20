public class MatheAnwendung {
    public static void main(String[] args) {

        // Test Punkt 2. aus Aufgabe a
        Arithmetik arithmetik = new Arithmetik();
        RechenwegPlus rechenwegPlus = new RechenwegPlus();
        IRechenweg rechenwegMinus = new RechenwegMinus();
        IRechenweg rechenwegMal = new RechenwegMal();

        System.out.println("Nicht generisch: ");
        arithmetik.bestimmeRechenweg(rechenwegPlus);
        System.out.println("5 + 4 = " + arithmetik.berechne(5, 4));

        arithmetik.bestimmeRechenweg(rechenwegMinus);
        System.out.println("5 - 4 = " + arithmetik.berechne(5, 4));

        arithmetik.bestimmeRechenweg(rechenwegMal);
        System.out.println("5 * 4 = " + arithmetik.berechne(5, 4));

        System.out.println("-------");

        // Test Punkt 3. aus Aufgabe a
        ArithmetikGenerisch<IRechenweg> arithmetikGenerisch = new ArithmetikGenerisch<>();

        System.out.println("Generisch: ");
        arithmetikGenerisch.bestimmeRechenweg(rechenwegPlus);
        System.out.println("12 + 4 = " + arithmetikGenerisch.berechne(12,4));

        arithmetikGenerisch.bestimmeRechenweg(rechenwegMinus);
        System.out.println("12 - 4 = " + arithmetikGenerisch.berechne(12,4));

        arithmetikGenerisch.bestimmeRechenweg(rechenwegMal);
        System.out.println("12 * 4 = " + arithmetikGenerisch.berechne(12,4));

    }
}