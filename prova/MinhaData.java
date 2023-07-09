package prova;

public class MinhaData
{
    private int Dia;
    private int Mes;
    private int Ano;

    public int getDia()
    {
        return Dia;
    }

    public int getMes()
    {
        return Mes;
    }

    public int getAno()
    {
        return Ano;
    }

    public void setDia(int Dia)
    {
        if (Dia <= 0 || Dia >= 32)
            System.out.println("ERRO!");
        else
            this.Dia = Dia;
    }

    public void setMes(int Mes)
    {
        if (Mes <= 0 || Mes >= 13)
            System.out.println("ERRO!");
        else
            this.Mes = Mes;
    }

    public void setAno(int Ano)
    {
        this.Ano = Ano;
    }

    public void mostrarData()
    {
        if (Mes == 1)
            System.out.println(Dia + " de Janeiro de " + Ano);
        if (Mes == 2)
            System.out.println(Dia + " de Fevereiro de " + Ano);
        if (Mes == 3)
            System.out.println(Dia + " de Março de " + Ano);
        if (Mes == 4)
            System.out.println(Dia + " de Abril de " + Ano);
        if (Mes == 5)
            System.out.println(Dia + " de Maio de " + Ano);
        if (Mes == 6)
            System.out.println(Dia + " de Junho de " + Ano);
        if (Mes == 7)
            System.out.println(Dia + " de Julho de " + Ano);
        if (Mes == 8)
            System.out.println(Dia + " de Agosto de " + Ano);
        if (Mes == 9)
            System.out.println(Dia + " de Setembro de " + Ano);
        if (Mes == 10)
            System.out.println(Dia + " de Outubro de " + Ano);
        if (Mes == 11)
            System.out.println(Dia + " de Novembro de " + Ano);
        if (Mes == 12)
            System.out.println(Dia + " de Dezembro de " + Ano);
    }
}
