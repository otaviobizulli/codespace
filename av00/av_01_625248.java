package av00;
import java.util.Scanner;

public class av_01_625248
{
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int A[][] = new int[5][5];
        int B[][] = new int[5][5];

        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
            {
                System.out.print("Digite o valor de A["+i+"]["+j+"]: ");
                A[i][j] = inp.nextInt();
            }
        
        System.out.print("Insira o valor de X: ");
        int X = inp.nextInt();

        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                if (A[i][j]%2==X%2)
                    B[i][j] = A[i][j] * X;
                else
                    B[i][j] = A[i][j];

        System.out.println("Matriz B: ");
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                System.out.print(B[i][j] + " ");
            System.out.println();
                
        inp.close();
    }
}

