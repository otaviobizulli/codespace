package aula9;

public class Televisao
{
    private int volume;
    private int canal;

    public Televisao()
    {
        volume = 50;
        canal = 1;
    }

    public int getVolume()
    {
        return volume;
    }

    public void aumentarVolume()
    {
        if (volume < 100)
            volume++;
    }

    public void diminuirVolume()
    {
        if (volume > 1)
            volume--;
    }

    public int getCanal()
    {
        return canal;
    }
    
    public void aumentarCanal()
    {
        if (canal < 50)
            canal++;
    }

    public void diminuirCanal()
    {
        if (canal > 1)
            canal--;
    }

    public void trocarCanal(int novoCanal)
    {
        if (novoCanal >= 1 && novoCanal <= 50)
            canal = novoCanal;
    }
}

