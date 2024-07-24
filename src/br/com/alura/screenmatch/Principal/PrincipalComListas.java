package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Matrix", 1999);
        filme1.avalia(5);
        Filme filme2 = new Filme("Harry Potter e a Pedra Filosofal", 2000);
        filme2.avalia(6);
        Filme filme3 = new Filme("Harry Potter e a Câmara Secreta", 2001);
        filme3.avalia(10);
        Serie serie1 = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();

        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        lista.forEach(System.out::println);

        for (Titulo titulo : lista) {
            System.out.println(titulo);
            if (titulo instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        System.out.println(" ");

        //Preciso implementar a interface Comparable<Titulo>
        Collections.sort(lista);
        System.out.println("Lista ordenada por nome usando Comparable: ");
        lista.forEach(System.out::println);
        System.out.println(" ");

        //Não preciso implementar a interface Comparable<Titulo>
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada por ano de lançamento usando Comparator: ");
        lista.forEach(System.out::println);
        System.out.println(" ");

        lista.sort(Comparator.comparing(Titulo::getNome));
        System.out.println("Lista ordenada por nome usando Comparator: ");
        lista.forEach(System.out::println);
    }
}
