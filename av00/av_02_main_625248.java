package av00;

import java.util.Scanner;

public class av_02_main_625248
{
    public static void main(String[] args)
    {
        av_02_625248 av_02_625248 = new av_02_625248();
        Scanner inp = new Scanner (System.in);
        System.out.print("Digite o seu nome: ");
        String name = inp.nextLine();
        av_02_625248.setname(name);
        System.out.print("Digite seu aniversario: ");
        String birthdate = inp.nextLine();
        av_02_625248.setbirthdate(birthdate);
        System.out.print("Digite sua altura: ");
        double height = inp.nextDouble();
        av_02_625248.setheight(height);
        av_02_625248.printdata();
    }       
}
