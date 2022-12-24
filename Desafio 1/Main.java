import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,n;
        ArrayList<Integer> par = new ArrayList<Integer>(); 
        ArrayList<Integer> impar = new ArrayList<Integer>(); 
        
        
        n = in.nextInt();
        while (n < 0 || n > 100000) {
            System.out.println("Inserir numero valido");
            n = in.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            while (x < 0) {
                System.out.println("Inserir numero positivo");
                x = in.nextInt();
            }

            if(x%2 == 0){
                par.add(x);
            }else{
                impar.add(x);
            }
            x = -1;
        }
        Collections.sort(par);
        Collections.sort(impar, Collections.reverseOrder());
        System.out.println("Resultado:");
        for (int numero : par) {
            System.out.println(numero);
        }
        for (int numero : impar) {
            System.out.println(numero);
        }
               
        in.close();

    }
}