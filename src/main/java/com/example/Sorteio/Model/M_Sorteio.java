package com.example.Sorteio.Model;

import java.util.Date;

public class M_Sorteio {
    private int[] resultados;
    private int qtd;
    private int min;
    private int max;
    private String dataFormatada;

    public M_Sorteio(int[] resultados, int qtd, int min, int max, String dataFormatada) {
        this.resultados = resultados;
        this.qtd = qtd;
        this.min = min;
        this.max = max;
        this.dataFormatada = dataFormatada;
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

    public String getDataFormatada() {
        return dataFormatada;
    }

}
