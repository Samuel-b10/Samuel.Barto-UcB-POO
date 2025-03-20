import animal.*;

public class Cod01 {

    public static void main(String[] args) throws Exception {
        
        System.out.println("\n");

        Cachorro c1 = new Cachorro("Zeus" ,"Lobo", "Preto", 85, 55);
        Cachorro c2 = new Cachorro("Bob" ,"Pastor Alemão", "Preto e Branco", 60, 40);

        c1.Aniversario();
        c1.Aniversario();
        c2.Aniversario();
        
        System.out.println(c1);
        
        System.out.println("\n");
        
        System.out.println("Nome do primeiro cachorro: " + c1.getNome());
        
        System.out.println("\n");

        c2.setPeso(42.5f);
        
        c1.Aniversario();
        
        System.out.println(c2);
        
        System.out.println("\n");

    }
}