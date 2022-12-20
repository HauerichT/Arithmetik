public class Arithmetik {

    private IRechenweg rechnung;

    public void bestimmeRechenweg(IRechenweg rechenweg) {
        this.rechnung = rechenweg;
    }

    public double berechne(double a, double b) {
        return rechnung.berechneErgebnis(a,b);
    }

}
