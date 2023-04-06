package aula4;
import java.util.Scanner;

public class ex3aula4
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Insira o tamanho da sequencia: ");
        int tam = inp.nextInt();
        int ult = 0;
        int num = 1;
        int va = 0;
        for (int cont = 1; cont <= tam; cont += 1)
        {
            System.out.print(cont + "º - ");
            if (num % 2 == 0)
                System.out.println(num +" (PAR)");
            else
                System.out.println(num +" (IMPAR)");
            va = num;
            num = ult;
            ult = va;
            num += ult;
            inp.close();
        }
    }
}