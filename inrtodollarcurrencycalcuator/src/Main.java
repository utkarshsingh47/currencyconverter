import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double d,i;
        d = Integer.parseInt(JOptionPane.showInputDialog(null, "enter INR "));
        System.out.println(d);
        i= d/83;
        String j = String.format("%.2f", i);
        JOptionPane.showMessageDialog(null, "In INR it is: Rupees " + j);

        System.out.println(i);
    }
}