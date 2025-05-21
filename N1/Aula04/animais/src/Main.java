import reino.aves.Arara;
import reino.aves.Calopsita;
import reino.aves.Galinha;
import reino.aves.Pardal;
import reino.mamiferos.Cachorro;
import reino.mamiferos.Gato;
import reino.reptil.Iguana;
import reino.reptil.Tartaruga;

public class Main {
    public static void main (String[] args) throws Exception {
        
        // Aves
        Arara Ara1 = new Arara("Loro", 4, "Azul");

            Ara1.EmitirSom();
            Ara1.Voar();
            Ara1.dormir();
            System.out.println("\n");

        Calopsita Cal1 = new Calopsita("Lola", 1, "verde");
            
            Cal1.EmitirSom();
            Cal1.Voar();
            System.out.println("\n");

        Galinha Gal1 = new Galinha("Cocó", 2, "Amaralada");
            
            Gal1.EmitirSom();
            Gal1.Voar();
            System.out.println("\n");

        Pardal Par1 = new Pardal("Pipo", 1, "vermelhado");

            Par1.EmitirSom();
            Par1.Voar();
            System.out.println("\n");

        // Mamiferos
        Cachorro Cac1 = new Cachorro("Rex", 5,"preto");
        
            Cac1.EmitirSom();
            Cac1.amamentar();
            Cac1.dormir();
            System.out.println("\n");

        Gato Gat1 = new Gato("Mimi", 3,"branco");

            Gat1.EmitirSom();
            Gat1.amamentar();
            System.out.println("\n");

        // Reptil
        Iguana Igu1 = new Iguana("pepe", 2, "marrom");

            Igu1.EmitirSom();
            Igu1.rastejar();
            Igu1.dormir();
            System.out.println("\n");

        Tartaruga Tar1 = new Tartaruga("tali", 80,"verde");

            Tar1.EmitirSom();
            Tar1.rastejar();
            System.out.println("\n");
    }
}
