package com.example.Sorteio.Service;

import com.example.Sorteio.Model.M_Sorteio;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@Service
public class S_Sorteio {

    public static M_Sorteio getSorteioNumero(int qtd, int min, int max, boolean ordenar, boolean repeticao) {
        int[] resultados = new int[qtd];
        int resultado;
        Random rand = new Random();

        for (int i = 0; i < qtd; i++) {
            if(repeticao == true) {
                resultado = rand.nextInt(min - 1, max) + 1;
                resultados[i] = resultado;
            }else {
                boolean encontrado;
                do {
                    resultado = rand.nextInt(min - 1, max) + 1;
                    int finalResultado = resultado;
                    encontrado = Arrays.stream(resultados).anyMatch(num -> num == finalResultado);
                } while (encontrado);
                resultados[i] = resultado;
            }
        }

        if (ordenar == true){
            Arrays.sort(resultados);
        }

        Date data = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMM 'de' yyyy, HH:mm", new Locale("pt", "BR"));

        String dataFormatada = formato.format(data);


        M_Sorteio m_sorteio = new M_Sorteio(resultados, qtd, min, max,dataFormatada);
        return m_sorteio;
    }
}

