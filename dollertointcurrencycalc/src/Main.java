import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int d,i;
        d = Integer.parseInt(JOptionPane.showInputDialog(null, "enter dollar "));
        System.out.println(d);
        i= d*83;

        JOptionPane.showMessageDialog(null,"In inr is "+i);
        System.out.println(i);
    }
}