import java.util.Scanner;

public class Carrello {

   private Prodotto[] prodotti;
   private int quantita;

   public Carrello(int dimensione) {
      prodotti = new Prodotto[dimensione];
      quantita = 0;
   }

   public void main() {
      Scanner input = new Scanner(System.in);

      do {
         System.out.println("Inserisci: 0 per Smartphone, 1 per Televisore, 2 per Cuffie");
         String tipoProdotto = input.nextLine();
         System.out.println("Inserisci il nome del prodotto");
         String nomeProdotto = input.nextLine();

         if (tipoProdotto.equals("0")) {
            // creare un nuovo smartphone
            Smartphone smartphone = new Smartphone(nomeProdotto);
            prodotti[quantita] = smartphone;
         } else if (tipoProdotto.equals("1")) {
            // creare un tv
            Televisore tv = new Televisore(nomeProdotto);
            prodotti[quantita] = tv;
         } else if (tipoProdotto.equals("2")) {
            // creare cuffie
            Cuffie cuffie = new Cuffie(nomeProdotto);
            prodotti[quantita] = cuffie;
         } else {
            // creare Prodotto generico
         }
         quantita = quantita + 1;
      } while (quantita < prodotti.length);

      // carrello pieno
      for (int i = 0; i < prodotti.length; i++) {
         System.out.println(prodotti[i].toString());
      }

   }
}
