package aula5;

import java.util.Scanner;

public class ex2aula5
{
    public static void main (String[] args)
    {
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner inp = new Scanner(System.in);
        System.out.print("Insira o valor de X: ");
        int vax = inp.nextInt();
        int B[] = new int[10];
        for (int i=0; i<10; i++)
            B[i] = A[i] + vax;
        for (int i=0; i<10; i++)
            System.out.print(A[i]+" ");
        System.out.println();
        for (int i=0; i<10; i++)
            System.out.print(B[i]+" ");
        inp.close();
    }  
}
