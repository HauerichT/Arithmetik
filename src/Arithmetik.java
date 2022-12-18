public class Arithmetik {

    private Rechenweg rechnung;

    public void bestimmeRechenweg(Rechenweg rechenweg) {
        this.rechnung = rechenweg;
        System.out.println(rechenweg.getClass());
    }

    public double berechne(double a, double b) {
        return rechnung.berechneErgebnis(a,b);
    }

}
