package reino.reptil;

import reino.Animal;

public abstract class Reptil extends Animal{

    public Reptil(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    public void rastejar() {

        System.out.println(nome + " está rastejando.");
        
    }

}
