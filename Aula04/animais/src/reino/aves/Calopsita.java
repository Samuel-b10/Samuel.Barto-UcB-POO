package reino.aves;

public class Calopsita extends Ave{

    public Calopsita (String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom(){

        System.out.println(nome + " está assobiando.");

    }

}
