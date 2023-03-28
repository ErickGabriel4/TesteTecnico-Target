import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner ler=new Scanner(System.in);
        int num,i=0,j=1,k=0;

        System.out.println("Digite um número:");
        num= ler.nextInt();

        while (k<num)
        {
            k = i + j;
            i=j;
            j=k;

        }
        if(k==num){
            System.out.println(num + " faz parte da sequência de Fibonacci.");
        }else{
            System.out.println(num + " não faz parte da sequência de Fibonacci");
        }
    }
}
