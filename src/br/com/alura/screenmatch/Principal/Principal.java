package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme filme1 = new Filme("Matrix", 1999);

        filme1.setDuracaoEmMinutos(135);
        filme1.setIncluidoNoPlano(true);

        filme1.avalia(9);
        filme1.avalia(8);
        filme1.avalia(9);

//        System.out.println("Total de avaliações do filme: " +filme1.getTotalDeAvaliacoes());
//        System.out.println("Média de avaliações do filme: " +filme1.pegaMedia());

        Filme filme2 = new Filme("Harry Potter e a Pedra Filosofal", 2000);

        filme2.setDuracaoEmMinutos(150);
        filme2.setIncluidoNoPlano(true);

        Filme filme3 = new Filme("Harry Potter e a Câmara Secreta", 2001);
        filme3.setDuracaoEmMinutos(150);
        filme3.setIncluidoNoPlano(true);

        Serie serie1 = new Serie("Lost", 2000);

        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(8);
        serie1.setMinutosPorEpisodio(30);
        serie1.setIncluidoNoPlano(true);

        filme1.exibeFichaTecnica();
        System.out.println(" ");
        filme2.exibeFichaTecnica();
        System.out.println(" ");
        serie1.exibeFichaTecnica();
        System.out.println(" ");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Calculadora: " + calculadora.getTotalTempo());
        System.out.println(" ");

        Episodio ep1Lost = new Episodio();
        ep1Lost.setNumeroEpisodio(1);
        ep1Lost.setSerie(serie1);
        ep1Lost.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filme1);
        filtro.filtrar(filme2);
        filtro.filtrar(ep1Lost);

//        System.out.println(filme2.toString());

        ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);

        System.out.println(listaFilmes);

        for (int i = 0; i < listaFilmes.size(); i++) {
            System.out.println(listaFilmes.get(i));

        }
    }

}