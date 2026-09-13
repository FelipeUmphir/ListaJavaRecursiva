import javax.swing.JOptionPane;
public class Ex03 {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        System.out.println(Soma(n));
    }
    
    static double Soma(double x) {
        if (x == 1) {
            return 1;
        } else {
            return (1/x + Soma(x-1));
        }
    }
}