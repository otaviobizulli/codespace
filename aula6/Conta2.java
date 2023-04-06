package aula6;

public class Conta2
{
    public String nro;
    double saldo;
    public Conta2(String nro, double saldo)
    {
        this.nro=nro;
        this.saldo=saldo;
    }
    public void atualizaSaldo(double novoSaldo)
    {
        this.saldo=novoSaldo;
    }
}
