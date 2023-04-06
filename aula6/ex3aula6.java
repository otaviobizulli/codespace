package aula6;

public class ex3aula6
{
    public static void main(String [] args)
    {
        Conta2 conta=new Conta2("1234",100);
        conta.nro="4321";
        conta.saldo=200;
        System.out.println("Nro da conta: R$"+conta.nro);
        System.out.println("Saldo atual: R$"+conta.saldo);
    }
}