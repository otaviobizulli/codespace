package aula12;

public class Horario implements MeuHorario
{
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora()
    {
        return hora;
    }

    public int getMinuto()
    {
        return minuto;
    }

    public int getSegundo()
    {
        return segundo;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo)
    {
        this.segundo = segundo;
    }

    public String toString()
    {
        String horaFormatada = String.format("%02d", hora);
        String minutoFormatado = String.format("%02d", minuto);
        String segundoFormatado = String.format("%02d", segundo);
        return horaFormatada + ":" + minutoFormatado + ":" + segundoFormatado;
    }
}
