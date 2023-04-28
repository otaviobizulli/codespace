package aula9;

import java.util.Scanner;

public class ex1aula9 {
    public static void main(String[] args) {
        Televisao minhaTV = new Televisao();
        ControleRemoto controle = new ControleRemoto(minhaTV);

        Scanner inp = new Scanner (System.in);
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirCanal();
        controle.trocarCanal(10);

        int volume = controle.consultarVolume();
        int canal = controle.consultarCanal();

        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
}

