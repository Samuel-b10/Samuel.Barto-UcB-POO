package reino.reptil;

public class Iguana extends Reptil{

    public Iguana(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom() {

        System.out.println(nome + " está fazendo um som de réptil.");

    }

}
