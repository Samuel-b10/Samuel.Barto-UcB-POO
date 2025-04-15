package reino.reptil;

public class Tartaruga extends Reptil {

    public Tartaruga(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom() {

        System.out.println(nome + " faz um som muito baixo.");

    }

}
