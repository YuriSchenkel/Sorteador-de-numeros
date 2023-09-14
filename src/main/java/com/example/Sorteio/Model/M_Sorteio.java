package com.example.Sorteio.Model;

public class M_Sorteio {
    private int[] resultados;
    private int qtd;
    private int min;
    private int max;

    public M_Sorteio(int[] resultados, int qtd, int min, int max) {
        this.resultados = resultados;
        this.qtd = qtd;
        this.min = min;
        this.max = max;
    }

    public int[] getResultados() {
        return resultados;
    }

    public int getQtd() {
        return qtd;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

}
