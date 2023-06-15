package aula12;

public class UsaHorario
{
    public static void main(String[] args)
    {
        Horario horario = new Horario();
        horario.setHora(8);
        horario.setMinuto(10);
        horario.setSegundo(40);

        System.out.println("Horário: " + horario.toString());
    }
}
