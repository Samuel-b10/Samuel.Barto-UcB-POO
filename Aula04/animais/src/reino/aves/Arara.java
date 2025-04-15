package reino.aves;

public class Arara extends Ave {

    public Arara(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom() {

        System.out.println(nome + " está gritando alto.");

    }

}
