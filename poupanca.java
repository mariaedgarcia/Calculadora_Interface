import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class poupanca {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Poupex"); // criação da janela
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // fundo, onde fica TUDO
        panel.setBackground(new Color(128, 128, 128));
        panel.setLayout(new BorderLayout());

        JPanel campo = new JPanel();
        campo.setLayout(new GridLayout(5, 2, 10, 10));
        campo.setBackground(new Color(128, 128, 128));

        JLabel label1 = new JLabel("Juros ao mês %:");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Num. de anos:");
        JTextField textField2 = new JTextField(10);

        JLabel label3 = new JLabel("Depósito mensal R$:");
        JTextField textField3 = new JTextField(10);

        JLabel label4 = new JLabel("Total poupado R$:");
        JTextField textField4 = new JTextField(10);
        textField4.setEditable(false); // não permite edição

        // Adicionando no campo
        campo.add(label1);
        campo.add(textField1);

        campo.add(label2);
        campo.add(textField2);

        campo.add(label3);
        campo.add(textField3);

        campo.add(label4);
        campo.add(textField4);

        // criação do botão
        JButton button = new JButton("OK");
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLUE);
        button.setPreferredSize(new Dimension(100, 50));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String jurosText = textField1.getText().trim();
                    String anosText = textField2.getText().trim();
                    String depositoText = textField3.getText().trim();

                    double juros = Double.parseDouble(jurosText) / 100.0;
                    int anos = Integer.parseInt(anosText);
                    double deposito = Double.parseDouble(depositoText);

                    if (juros < 0 || anos < 0 || deposito < 0) {
                        JOptionPane.showMessageDialog(frame, "Por favor, insira valores positivos!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int meses = anos * 12;
                    double resultado = 0.0;

                    for (int i = 0; i < meses; i++) {
                        resultado += deposito;
                        resultado += resultado * juros;
                    }

                    textField4.setText(String.format("R$ %.2f", resultado));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Adicionando campo e botão no frame
        panel.add(campo, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null); // centraliza a janela
        frame.setVisible(true);
    }
}
