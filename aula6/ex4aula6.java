package aula6;

public class ex4aula6
{
    public static void main(String [] args)
    {
        Conta3 conta = new Conta3("1234", 100);
        conta.saldo=200;
        conta.depositar(100);
        conta.sacar(50);
        System.out.println("Saldo atual: R$"+conta.getSaldo());
    }    
}
