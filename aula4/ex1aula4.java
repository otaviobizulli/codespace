package aula4;
public class ex1aula4
{
    public static void main(String[] args)
    {
        int ult = 0;
        int num = 1;
        int va = 0;
        for (int cont = 0; cont <= 19; cont += 1)
        {
            if (num % 2 == 0)
                System.out.println(num +" (PAR)");
            else
                System.out.println(num +" (IMPAR)");
            va = num;
            num = ult;
            ult = va;
            num += ult;
        }
    }
}
