import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

    public class Main{
        public static void main(String[]args){
            Scanner in= new Scanner(System.in);
            in.useLocale(Locale.US);
            double N = 0.0;
            int moedas, Nota100, Nota50, Nota20, Nota10, Nota5, Nota2, Moeda1, Moeda50, Moeda25, Moeda10,Moeda5, Moeda01;
            Moeda1=0;
            N = in.nextDouble();
            N = TwoDecimal(N);
            moedas = (int) ((N - (int)N) * 100);
            System.out.println(""+N);
            System.out.println("NOTAS:");
            Nota100=(int)N/100;
            N=N-(Nota100*100);
            System.out.println(Nota100+" nota(s) de R$ 100,00");
            Nota50=(int)N/50;
            N=N-(Nota50*50);
            System.out.println(Nota50+" nota(s) de R$ 50,00");
            Nota20= (int)N/20;
            N=N-(Nota20*20);
            System.out.println(Nota20+" nota(s) de R$ 20,00");
            Nota10=(int)N/10;
            N=N-(Nota10*10);
            System.out.println(Nota10+" nota(s) de R$ 10,00");
            Nota5= (int)N/5;
            N=N-(Nota5*5);
            System.out.println(Nota5+" nota(s) de R$ 5,00");
            Nota2= (int)N/2;
            N=N-(Nota2*2);
            System.out.println(Nota2+" nota(s) de R$ 2,00");
            
            System.out.println("MOEDAS:");
            Moeda1= (int)N/1;
            N=N-(Moeda1*1);
            System.out.println(Moeda1 + " moeda(s) de R$ 1,00");
            Moeda50 = (int) moedas/ 50;
            moedas = moedas - (Moeda50 * 50);
            System.out.println(Moeda50 + " moeda(s) de R$ 0,50");
            Moeda25 = (int) moedas / 25;
            moedas = moedas - (Moeda25 * 25);
            System.out.println(Moeda25 + " moeda(s) de R$ 0,25");
            Moeda10 = (int) moedas / 10;
            moedas = moedas - (Moeda10 * 10);
            System.out.println(Moeda10 + " moeda(s) de R$ 0,10");
            Moeda5 = (int) moedas / 5;
            moedas = moedas - (Moeda5 * 5);
            System.out.println(Moeda5 + " moeda(s) de R$ 0,05");
            Moeda01 = (int) moedas / 1;
            moedas = moedas - (Moeda01 * 1);
            System.out.println(Moeda01 + " moeda(s) de R$ 0,01");




            in.close();
    }

    private static double TwoDecimal(double x) {
        String z;

        z = String.format("%2f"+"d", x);
        try {
            x = DecimalFormat.getNumberInstance().parse(z).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

}