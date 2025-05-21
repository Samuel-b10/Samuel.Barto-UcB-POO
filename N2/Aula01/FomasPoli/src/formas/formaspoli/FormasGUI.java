package formas.formaspoli;

import javax.swing.*;
import java.awt.*;


public class FormasGUI extends JFrame {
    private JComboBox<String> formaCombo;
    private JPanel camposPanel;
    private JButton calcularBtn;
    private JTextArea resultadoArea;

    public FormasGUI() {
        super("Calculadora de Formas Geométricas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Topo: ComboBox
        String[] opcoes = {"Retângulo", "Triângulo", "Pentágono", "Circunferência"};
        formaCombo = new JComboBox<>(opcoes);
        add(formaCombo, BorderLayout.NORTH);

        // Centro: Painel de campos dinâmicos
        camposPanel = new JPanel();
        camposPanel.setLayout(new GridLayout(5, 2));
        add(camposPanel, BorderLayout.CENTER);

        // Botão
        calcularBtn = new JButton("Calcular");
        add(calcularBtn, BorderLayout.SOUTH);

        // Resultado
        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);
        add(new JScrollPane(resultadoArea), BorderLayout.EAST);

        // Atualiza os campos iniciais
        atualizarCampos();

        // Listeners
        formaCombo.addActionListener(e -> atualizarCampos());

        calcularBtn.addActionListener(e -> calcular());

        setVisible(true);
    }

    private void atualizarCampos() {
        camposPanel.removeAll();
        String escolha = (String) formaCombo.getSelectedItem();

        switch (escolha) {
            case "Retângulo":
                adicionarCampo("Largura");
                adicionarCampo("Altura");
                break;
            case "Triângulo":
                adicionarCampo("Lado X");
                adicionarCampo("Lado Y");
                adicionarCampo("Lado Z");
                break;
            case "Pentágono":
                adicionarCampo("Lado");
                adicionarCampo("Apótema");
                break;
            case "Circunferência":
                adicionarCampo("Raio");
                break;
        }

        camposPanel.revalidate();
        camposPanel.repaint();
    }

    private void adicionarCampo(String label) {
        JLabel l = new JLabel(label + ":");
        JTextField tf = new JTextField();
        tf.setName(label);
        camposPanel.add(l);
        camposPanel.add(tf);
    }

    private void calcular() {
        String escolha = (String) formaCombo.getSelectedItem();
        Component[] componentes = camposPanel.getComponents();

        try {
            Forma forma = null;

            switch (escolha) {
                case "Retângulo":
                    float largura = Float.parseFloat(((JTextField) componentes[1]).getText());
                    float altura = Float.parseFloat(((JTextField) componentes[3]).getText());
                    forma = new Retangulo(largura, altura);
                    break;

                case "Triângulo":
                    float x = Float.parseFloat(((JTextField) componentes[1]).getText());
                    float y = Float.parseFloat(((JTextField) componentes[3]).getText());
                    float z = Float.parseFloat(((JTextField) componentes[5]).getText());
                    forma = new Triangulo(x, y, z);
                    break;

                case "Pentágono":
                    float lado = Float.parseFloat(((JTextField) componentes[1]).getText());
                    float apotema = Float.parseFloat(((JTextField) componentes[3]).getText());
                    forma = new Pentagono(lado, apotema);
                    break;

                case "Circunferência":
                    float raio = Float.parseFloat(((JTextField) componentes[1]).getText());
                    forma = new Circunferencia(raio);
                    break;
            }

            if (forma != null) {
                resultadoArea.setText("Forma: " + forma.getClass().getSimpleName() +
                                      "\nÁrea: " + forma.area() +
                                      "\nPerímetro: " + forma.perimetro());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new FormasGUI();
    }
}
