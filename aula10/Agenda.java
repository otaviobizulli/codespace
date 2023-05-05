package aula10;

public class Agenda
{
    private Pessoa[] pessoas;
    private int quantidadePessoas;

    public Agenda()
    {
        pessoas = new Pessoa[10];
        quantidadePessoas = 0;
    }

    public void armazenaPessoa(String nome, int idade, float altura)
    {
        if (quantidadePessoas < 10)
        {
            Pessoa novaPessoa = new Pessoa(nome, idade, altura);
            pessoas[quantidadePessoas] = novaPessoa;
            quantidadePessoas++;
            System.out.println("Pessoa adicionada com sucesso!");
        }
        else
        {
            System.out.println("A agenda está cheia. Não é possível adicionar mais pessoas.");
        }
    }

    public void removePessoa(String nome)
    {
        int posicao = buscaPessoa(nome);
        if (posicao != -1)
        {
            for (int i = posicao; i < quantidadePessoas - 1; i++)
            {
                pessoas[i] = pessoas[i + 1];
            }
            pessoas[quantidadePessoas - 1] = null;
            quantidadePessoas--;
            System.out.println("Pessoa removida com sucesso!");
        }
        else
        {
            System.out.println("Pessoa não encontrada na agenda.");
        }
    }

    public int buscaPessoa(String nome)
    {
        for (int i = 0; i < quantidadePessoas; i++)
        {
            if (pessoas[i].getNome().equals(nome))
            {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda()
    {
        if (quantidadePessoas == 0)
        {
            System.out.println("A agenda está vazia.");
        }
        else
        {
            System.out.println("Agenda:");
            for (int i = 0; i < quantidadePessoas; i++)
            {
                System.out.println((i + 1) + ". " + pessoas[i].getNome());
            }
        }
    }

    public void imprimePessoa(int index)
    {
        if (index >= 0 && index < quantidadePessoas)
        {
            Pessoa pessoa = pessoas[index];
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
        }
        else
        {
            System.out.println("Índice inválido.");
        }
    }
}

