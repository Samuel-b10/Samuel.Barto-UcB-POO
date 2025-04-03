package campeonato;

public class Premiacao {

    private String titulo;
    private int ano;

    public Premiacao (String titulo, int ano) {

        this.titulo = titulo;
        this.ano = ano;


    }
    
    public String getTitulo() {

        return titulo;

    }

    public int getAno() {

        return ano;
         
    }

    @Override
    public String toString() {

        return "Título: " + titulo + " | Ano: " + ano;
        
    }
}
