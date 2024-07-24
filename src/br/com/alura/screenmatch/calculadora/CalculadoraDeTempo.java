package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int totalTempo = 0;

    public void inclui (Titulo titulo) {
        this.totalTempo += titulo.getDuracaoEmMinutos();
    }

    public int getTotalTempo() {
        return totalTempo;
    }
}
