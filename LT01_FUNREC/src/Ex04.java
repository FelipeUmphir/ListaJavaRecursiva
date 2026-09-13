import javax.swing.JOptionPane;
public class Ex04 {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
    
        System.out.println(Soma(n, 1));
    }
    
    static double Soma(double x, double i) {
        if (x == 1) {
            return (1/i);
        } else {
            return (x/i + Soma(x - 1, i + 1));
        }
    }
}