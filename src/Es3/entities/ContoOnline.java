package Es3.entities;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println(
                "Titolare: " + getTitolare() +
                        " - Saldo: " + getSaldo() +
                        " - Num movimenti: " + getnMovimenti() +
                        " - Massimo movimenti: " + getMaxMovimenti() +
                        " - Massimo prelievo possibile: " + maxPrelievo
        );
    }

    public void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
    }
}
