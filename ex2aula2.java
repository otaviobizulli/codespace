import java.rmi.StubNotFoundException;

public class ex2aula2
{
    public static void main(String[] args)
    {
        int ult = 0;
        int num = 1;
        int va = 0;
        for (int cont = 0; cont <= 29; cont += 1)
        {
            System.out.println(num);
            va = num;
            num = ult;
            ult = va;
            num += ult;
        }
    }
}
