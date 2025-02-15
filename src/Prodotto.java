
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private int iva;

    public Prodotto(String nome) {
        Random rand = new Random();
        codice = rand.nextInt();
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void stampa() {
        System.out.println(codice + " * " + nome);
    }
}
