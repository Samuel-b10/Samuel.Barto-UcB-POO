package reino;

public abstract class Animal {

    protected String nome;
    protected int idade;
    protected String cor;

    public Animal(String nome, int idade, String cor) {

        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }

    public abstract void EmitirSom();

    public void dormir(){
        System.out.println(nome + " está dormindo");
    }

}
