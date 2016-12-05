import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

/**
 * Created by cm63 on 05/12/16.
 */
public class PasswordChecker {

    public static void main(String []args) {
        JFrame frame = new JFrame("Password Checker");
        frame.setSize(600,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3,1));


        JPanel passwordPanel = new JPanel();
        JLabel passwordLabel = new JLabel("Password");
        passwordPanel.add(passwordLabel);
        JTextField passwordField = new JTextField(20);
        passwordPanel.add(passwordField);
        JButton checkButton = new JButton("Check");
        passwordPanel.add(checkButton);
        container.add(passwordPanel);

        JPanel testPanel = new JPanel();
        JLabel length = new JLabel("Length");
        testPanel.add(length);
        JLabel digits = new JLabel("Digits");
        testPanel.add(digits);
        JLabel uppercase = new JLabel("Uppercase");
        testPanel.add(uppercase);
        JLabel symbol = new JLabel("Symbol");
        testPanel.add(symbol);
        container.add(testPanel);

        JPanel improvementPanel = new JPanel();
        JTextField suggestionField = new JTextField(20);
        improvementPanel.add(suggestionField);
        JButton improveButton = new JButton("Improve");
        improvementPanel.add(improveButton);
        container.add(improvementPanel);

        frame.add(container);
        frame.setVisible(true);
    }
}
