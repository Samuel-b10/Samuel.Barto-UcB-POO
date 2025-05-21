package reino.mamiferos;

import reino.Animal;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome, int idade, String cor) {

        super(nome, idade, cor);

    }

    public void amamentar() {

        System.out.println(nome + " está amamentando.");
         
    }

}
