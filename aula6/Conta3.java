package aula6;

public class Conta3
{
    private String nro;
    private double saldo;
    public Conta3(String nro, double saldo)
    {
        this.nro=nro;
        this.saldo=saldo;
    }
    public void depositar (double valor)
    {
        this.saldo+=valor;
    }
    public void sacar (double valor)
    {
        this.saldo-=valor;
    }
    public float getSaldo()
    {
        return this.saldo;
    }
}

