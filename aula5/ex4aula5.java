package aula5;

import java.util.Scanner;

public class ex4aula5
{
    public static void main (String[] args)
    {
        int A[][] = new int[3][5];

        int cont = 0;
        for (int i=0; i<3; i++)
            for (int j=0; j<5; j++)
                A[i][j] = cont++;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Insira o valor de X: ");
        int vax = inp.nextInt();
        if (vax%2==0)
        {
            for (int i=0; i<3; i++)
                for (int j=0; j<5; j++)
                    if (A[i][j]%2==0)
                        System.out.println(A[i][j]);
        }
        else
        {
            for (int i=0; i<3; i++)
                for (int j=0; j<5; j++)
                    if (A[i][j]%2!=0)
                        System.out.println(A[i][j]);
        }
        inp.close();
    }
}
