package aula8;

public class aula8ex1 
{
    public static void main(String args[])
    {
        Lampada lampada1 = new Lampada ("Incandescente");
        lampada1.setPotencia(40);
        System.out.println(lampada1);
        Interruptor i1 = new Interruptor();
        i1.conectar(lampada1);
        System.out.println(i1);
        i1.ligar();
        System.out.println(lampada1);
        i1.desligar();
        System.out.println(lampada1);
    }    
} 
