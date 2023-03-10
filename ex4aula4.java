import java.util.Scanner;

public class ex4aula4
{
    public static void main(String[] args)
    {
        int total;
        Scanner inp = new Scanner(System.in);
        System.out.print("Insira os dias: ");
        int dia = inp.nextInt();
        System.out.print("Insira as horas: ");
        int hor = inp.nextInt();
        System.out.print("Insira os minutos: ");
        int min = inp.nextInt();
        System.out.print("Insira os segundos: ");
        int sec = inp.nextInt();
        total = sec + (min*60) + (hor*3600) + (dia*86400);
        System.out.println("Total em segundos: "+ total);        
        inp.close();
    }
}

