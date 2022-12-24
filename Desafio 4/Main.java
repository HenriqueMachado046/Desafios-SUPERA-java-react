import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner (System.in);

        String texto,soma;
        int testes,j;
        soma="";
        testes=in.nextInt();
        for (int i=0;i<testes;i++){
            texto=in.nextLine();
            soma="";
            while (texto.length()>100 || texto.length()<2) {
                texto=in.nextLine();
            }
            for (j=texto.length()/2;j>0;j--){
                soma=soma+texto.charAt(j-1);    
            }                
            for (int k=texto.length();k>(texto.length()/2);k--){
                soma=soma+texto.charAt(k-1);
            }
            System.out.println(soma);
        }        
        in.close();

    }
}