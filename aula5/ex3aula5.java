package aula5;

public class ex3aula5
{
    public static void main (String[] args)
    {
        int A[][] = new int[5][5];
        int B[][] = new int[5][5];
        int C[][] = new int[5][5];

        int cont = 0;
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                A[i][j] = cont++;
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                B[i][j] = A[i][j];
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                C[i][j] = A[i][j] + B[i][j];
        
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                System.out.print(A[i][j]+" ");
        System.out.println();
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                System.out.print(B[i][j]+" ");
        System.out.println();
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                System.out.print(C[i][j]+" ");
    }
}
