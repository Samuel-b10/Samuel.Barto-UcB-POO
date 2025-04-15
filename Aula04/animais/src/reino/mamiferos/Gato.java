package reino.mamiferos;

public class Gato extends Mamifero{

    public Gato(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom() {

        System.out.println(nome + " está miando.");
         
    }

}
