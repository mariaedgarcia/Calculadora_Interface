import javax.swing.*;
import java.awt.*;

public class poupanca {

    public static void main (String[] args){

       JFrame frame = new JFrame("Poupex"); // criação da janela
       frame.setSize(400, 300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel = new JPanel(); // fundo, onde fica TUDO

       JButton button = new JButton("OK"); // criação do botão
       button.setPreferredSize(new Dimension(200, 30)); // Dando o tamanho do meu botão

       JLabel label1 = new JLabel("Juros ao mes %:"); // add texto
       JLabel label2 = new JLabel("Num. de anos:");
       JLabel label3 = new JLabel("Deposito mensal R$:");
       JLabel label4 = new JLabel("Total poupado R$:");

       JTextField textField1 = new JTextField(10); // Linha para escrever
       JTextField textField2 = new JTextField(10);
       JTextField textField3 = new JTextField(10);
       JTextField textField4 = new JTextField(10);

       panel.add(label1);
       panel.add(textField1);
       
       panel.add(label2);
       panel.add(textField2);

       panel.add(label3);
       panel.add(textField3);

       panel.add(label4);
       panel.add(textField4);

       panel.add(button);
       frame.add(panel);

       frame.setVisible(true); // tornando visível
    }
}