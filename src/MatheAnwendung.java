public class MatheAnwendung {
    public static void main(String[] args) {

        Arithmetik arithmetik = new Arithmetik();
        RechenwegPlus rechenwegPlus = new RechenwegPlus();
        Rechenweg rechenwegMinus = new RechenwegMinus();
        Rechenweg rechenwegMal = new RechenwegMal();

        arithmetik.bestimmeRechenweg(rechenwegPlus);
        System.out.println(arithmetik.berechne(5, 4));

        arithmetik.bestimmeRechenweg(rechenwegMinus);
        System.out.println(arithmetik.berechne(5, 4));

        arithmetik.bestimmeRechenweg(rechenwegMal);
        System.out.println(arithmetik.berechne(5, 4));

        System.out.println("-------");

        ArithmetikGenerisch<Rechenweg> arithmetikGenerisch = new ArithmetikGenerisch<>();
        arithmetikGenerisch.bestimmeRechenweg(rechenwegPlus);
        System.out.println(arithmetikGenerisch.berechne(12,4));

        arithmetikGenerisch.bestimmeRechenweg(rechenwegMinus);
        System.out.println(arithmetikGenerisch.berechne(12,4));

        arithmetikGenerisch.bestimmeRechenweg(rechenwegMal);
        System.out.println(arithmetikGenerisch.berechne(12,4));

    }
}