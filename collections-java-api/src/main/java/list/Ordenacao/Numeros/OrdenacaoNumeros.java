package main.java.list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdenadosAscendente = new ArrayList<>(numerosList);
        Collections.sort(numerosOrdenadosAscendente);
        return numerosOrdenadosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdenadosDescendente = new ArrayList<>(numerosList);
        numerosOrdenadosDescendente.sort(Collections.reverseOrder());
        return numerosOrdenadosDescendente;
    }

    public void exibirNumeros(){
        System.out.println(this.numerosList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(22);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(42);
        numeros.adicionarNumero(-1);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

    }
}
