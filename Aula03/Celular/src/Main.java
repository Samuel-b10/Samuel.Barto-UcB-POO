import java.util.Scanner;
import eletronico.Contato;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Contato[] contatos = new Contato[3];

        // Criando três contatos
        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o nome do contato " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o telefone do contato " + (i + 1) + ":");
            String telefone = scanner.nextLine();

            contatos[i] = new Contato(nome, telefone);
        }

        // Modificando os contatos
        for (int i = 0; i < 3; i++) {

            System.out.println("Deseja modificar o contato " + (i + 1) + "? (s/n)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {

                System.out.println("Novo nome:");

                contatos[i].setNome(scanner.nextLine());

                System.out.println("Novo telefone:");

                contatos[i].setTelefone(scanner.nextLine());
            }
        }

        // Exibindo os contatos
        System.out.println("\nLista de Contatos:");

        for (Contato contato : contatos) {

            System.out.println(contato);

        }

    }
}
