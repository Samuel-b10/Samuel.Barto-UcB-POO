package reino.mamiferos;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom() {

        System.out.println(nome + " está latindo.");
         
    }

}   
