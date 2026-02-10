package array;

public class Studente {
   
    private String nome;
    private int voto;

    public Studente(String nome, int voto) {
        this.nome = nome;
        this.voto = voto;
    }

   
    int getVoto() {
        return voto;
    }

    public void stampaInfo() {
        System.out.println("Lo studente si chiama: " + nome +
                           " ed ha preso: " + voto + ".");

        if (voto >= 18) {
            System.out.println("PROMOSSO");
        } else {
            System.out.println("BOCCIATO!");
        }
    }
}

