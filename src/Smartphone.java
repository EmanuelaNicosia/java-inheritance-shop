import java.util.Random;

public class Smartphone extends Prodotto {

    private int codiceIMEI;
    private int memoria;

    public Smartphone(String nome) {
        super(nome);
        Random rand = new Random();
        codiceIMEI = rand.nextInt();
    }

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "SMARTPHONE: " + super.getNome();
    }

}
