public class Ex01 {
    
    public static void main(String[] args) {
        int n = 100;
        
        System.out.println(Soma(n));
    }
    
    static int Soma(int x) {
        if (x == 1) {
            return 1;
        } else {
            return (x + Soma(x - 1));
        }
    }
}