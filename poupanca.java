import javax.swing.*;
import java.awt.*;

public class poupanca {

    public static void main (String[] args){

        JFrame frame = new JFrame("Poupex");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setSize(300, 500);

        JLabel label1 = new JLabel();
        label1.setText("Juros ao mes%: ");

        JLabel label2 = new JLabel();
        label2.setText("Num. de anos: ");

        JLabel label3 = new JLabel();
        label3.setText("Deposito mensal R$: ");

        JLabel label4 = new JLabel();
        label4.setText("Total poupado R$: ");

        JTextArea textArea1 = new JTextArea(2, 20);

        JTextArea textArea2 = new JTextArea(2, 20);

        JTextArea textArea3 = new JTextArea(2, 20);

        JTextArea textArea4 = new JTextArea(2, 20);
        
        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.add(label1);



        // fazendo ser "exibido"

        panel.add(label1);
        panel.add(textArea1);

        panel.add(label2);
        panel.add(textArea2);

        panel.add(label3);
        panel.add(textArea3);

        panel.add(label4);
        panel.add(textArea4);

        frame.add(panel);

        frame.setVisible(true);
    }
}