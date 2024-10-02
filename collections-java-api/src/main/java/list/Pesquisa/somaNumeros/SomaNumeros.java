package main.java.list.Pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer i : numerosList){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        boolean isFirst = true;
        for (Integer i : numerosList){
            if (isFirst){
                maiorNumero = i;
                isFirst = false;
            } else {
                if(maiorNumero < i){
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        boolean isFirst = true;
        for (Integer i : numerosList){
            if (isFirst){
                menorNumero = i;
                isFirst = false;
            } else {
                if(menorNumero > i){
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        for (Integer i : numerosList){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(211);
        soma.adicionarNumero(2);
        soma.adicionarNumero(22);
        soma.adicionarNumero(223);
        soma.adicionarNumero(25);
        System.out.println(soma.encontrarMenorNumero());
        soma.exibirNumeros();
    }
}
