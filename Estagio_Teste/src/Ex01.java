import java.util.Scanner;



public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número desejado: ");
        int resp = sc.nextInt();
        if (isFibonacci(resp)){
            System.out.println(resp+" faz parte da sequência de fibonacci");
        }else {
            System.out.println(resp+" não faz parte da sequência de fibonacci");
        }
    }



    public static boolean isFibonacci(int n){
        int a=0, b=1;
        while (b<n){
            int anterior = b;
            b= a+b;
            a = anterior;
        }
        if (b==n){
            return true;
        }else {
            return false;
        }




    }
}
