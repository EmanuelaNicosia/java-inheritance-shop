public class Cuffie extends Prodotto {
    
    private String colore;
    private boolean wireless;

    public Cuffie(String nome) {
        super(nome);
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    
}
