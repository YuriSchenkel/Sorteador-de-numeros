package com.example.Sorteio.Service;

import com.example.Sorteio.Model.M_Sorteio;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class S_Sorteio {

    public static M_Sorteio getSorteioNumero(int qtd, int min, int max, boolean ordenar, boolean repeticao) {
        int[] resultados = new int[qtd];
        int resultado;
        Random rand = new Random();

        for (int i = 0; i < qtd; i++) {
            if(repeticao == true) {
                resultado = rand.nextInt(min, max) + 1;
                resultados[i] = resultado;
            }else {
                boolean encontrado;
                do {
                    resultado = rand.nextInt(min, max) + 1;
                    int finalResultado = resultado;
                    encontrado = Arrays.stream(resultados).anyMatch(num -> num == finalResultado);
                } while (encontrado);
                resultados[i] = resultado;
            }
        }

        if (ordenar == true){
            Arrays.sort(resultados);
        }

        M_Sorteio m_sorteio = new M_Sorteio(resultados, qtd, min, max);
        return m_sorteio;
    }
}

