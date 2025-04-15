package reino.aves;

import reino.Animal;

public abstract class Ave extends Animal{

    public Ave(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    public void Voar(){

        System.out.println(nome + " está voando.");

    }

}
