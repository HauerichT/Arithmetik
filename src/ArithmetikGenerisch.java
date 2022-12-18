public class ArithmetikGenerisch<R extends Rechenweg> {

    private R rechnung;

    public void bestimmeRechenweg(R r) {
        this.rechnung = r;
        System.out.println(r.getClass());
    }

    public double berechne(double a, double b) {
        return rechnung.berechneErgebnis(a, b);
    }
}
