package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {

private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + super.toString();
    }
}