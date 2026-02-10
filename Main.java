package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Studente studenti[] = new Studente[5];

       
        for (int i = 0; i < studenti.length; i++) {

            System.out.println("Inserisci nome studente " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Inserisci il voto dello studente " + (i + 1) + ":");
            int voto = scanner.nextInt();

          
            if (voto >= 0 && voto <= 30) {
                scanner.nextLine(); 
            } else {
                System.out.println("Voto non valido..");
            }

            Studente S = new Studente(nome, voto);

           
            studenti[i] = S;
        }

    
        int somma = 0;

        for (int i = 0; i < studenti.length; i++) {
            somma += studenti[i].getVoto();
        }

       
        int media = somma / studenti.length;

       
        int max = studenti[0].getVoto();
        int min = studenti[0].getVoto();

        for (int i = 1; i < studenti.length; i++) {

            if (studenti[i].getVoto() > max) {
                max = studenti[i].getVoto();
            }

            if (studenti[i].getVoto() < min) {
                min = studenti[i].getVoto();
            }
        }

        System.out.println("\n--- ELENCO STUDENTI ---");

        for (int i = 0; i < studenti.length; i++) {
            studenti[i].stampaInfo();
        }

        System.out.println("La somma dei voti degli studenti è: " + somma);
        System.out.println("La media dei voti degli studenti è: " + media);
        System.out.println("Voto massimo: " + max);
        System.out.println("Voto minimo: " + min);
    }
}
