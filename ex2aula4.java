import java.util.Scanner;

public class ex2aula4
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = inp.nextLine();
        System.out.print("Insira sua rua: ");
        String rua = inp.nextLine();
        System.out.print("Insira seu telefone: ");
        int tel = inp.nextInt();
        System.out.print("Insira o numero de sua residencia: ");
        int num = inp.nextInt();
        int tam = nome.length();
        System.out.println("Nome:" + " " + nome);
        System.out.println("Endereço:" + " " + rua + ", " + num);
        System.out.println("Telefone:" + " " + tel);
        inp.close();
    }
}
