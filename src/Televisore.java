
public class Televisore extends Prodotto {

    private int altezza;
    private int larghezza;
    private int profondita;
    private boolean smart;

    public Televisore(String nome) {
        super(nome);
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getProfondita() {
        return profondita;
    }

    public void setProfondita(int profondita) {
        this.profondita = profondita;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "TV: " + super.getNome();
    }

}
