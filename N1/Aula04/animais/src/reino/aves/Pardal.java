package reino.aves;

public class Pardal extends Ave{

    public Pardal(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom(){

        System.out.println(nome + " está piando.");

    }

}
