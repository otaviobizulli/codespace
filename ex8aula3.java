import javax.sound.sampled.SourceDataLine;

public class ex8aula3
{
    public static void main(String[] args)
    {
        String nome = "Otavio Rodrigues Bizulli";
        int tam = nome.length();
        for(int cont = 0; cont <= tam; cont++)
        {
        char c = nome.charAt(cont);
        System.out.println(c);
        }
    }
}