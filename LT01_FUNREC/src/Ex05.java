import javax.swing.JOptionPane;
public class Ex05 {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        System.out.println(Soma(n));
    }
    
    static int Soma(int x) {
        if (x == 1) {
            return 1;
        } else {
            int s = 1;
            
            for (int i = 2; i <= x; i++) {
                s = s * i;
            }
            
            return (s + Soma(x-1));
        }
    }
}