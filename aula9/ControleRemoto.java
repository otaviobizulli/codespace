package aula9;

public class ControleRemoto
{
    private Televisao televisao;

    public ControleRemoto(Televisao televisao)
    {
        this.televisao = televisao;
    }

    public void aumentarVolume()
    {
        televisao.aumentarVolume();
    }

    public void diminuirVolume()
    {
        televisao.diminuirVolume();
    }

    public void aumentarCanal()
    {
        televisao.aumentarCanal();
    }

    public void diminuirCanal()
    {
        televisao.diminuirCanal();
    }

    public void trocarCanal(int novoCanal)
    {
        televisao.trocarCanal(novoCanal);
    }

    public int consultarVolume()
    {
        return televisao.getVolume();
    }

    public int consultarCanal()
    {
        return televisao.getCanal();
    }
}
