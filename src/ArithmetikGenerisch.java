public class ArithmetikGenerisch<R extends IRechenweg> {

    private R rechnung;

    public void bestimmeRechenweg(R r) {
        this.rechnung = r;
    }

    public double berechne(double a, double b) {
        return rechnung.berechneErgebnis(a, b);
    }
}
