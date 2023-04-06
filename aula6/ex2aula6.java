package aula6;

public class ex2aula6
{
    class CriaConta
    {
        public static void main(String [] args)
        {
            Conta conta1 = new Conta();
            conta1.numero = "21.342-7";
            conta1.saldo = 0;
            conta1.credito (500.87);
            conta1.debito (45.00);
            System.out.println(conta1.saldo);
        }
    }
}
