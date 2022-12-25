import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n, k, count=0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insira o tamanho do array:");
        n = in.nextInt();
        int [] array = new int [n];
        
        System.out.println("Insira o valor alvo:");
        k = in.nextInt();
        
        System.out.println("Insira os valores no array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            if(i+1 < array.length){
                for (int j = i+1; j < array.length; j++) {
                    if(array[i] > array[j]){
                        if(array[i] - array[j] == k){
                            count++;
                        }
                    }else{
                        if (array[j] - array[i] == k) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);

        in.close();
        
    }
}