package reino.aves;

public class Galinha extends Ave{

    public Galinha(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    @Override
    public void EmitirSom(){

        System.out.println(nome + " está cacarejando.");

    }

    @Override
    public void Voar(){

        System.out.println("A " + nome + " voa muito baixo.");

    } 

}
