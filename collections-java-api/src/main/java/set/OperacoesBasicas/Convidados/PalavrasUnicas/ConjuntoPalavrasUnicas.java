package main.java.set.OperacoesBasicas.Convidados.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for (String p : palavrasUnicasSet){
            if (p.equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                break;
            }
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }

//    public void removerPalavra(String palavra) {
//        if (!palavrasUnicasSet.isEmpty()) {
//            if (palavrasUnicasSet.contains(palavra)) {
//                palavrasUnicasSet.remove(palavra);
//            } else {
//                System.out.println("Palavra não encontrada no conjunto!");
//            }
//        } else {
//            System.out.println("O conjunto está vazio!");
//        }
//    }

    public boolean verificarPalavra(String palavra) {
        boolean isEqual = false;
        for (String p : palavrasUnicasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                isEqual =true;
                break;
            }
        }
        return isEqual;
    }

    //  public boolean verificarPalavra(String palavra) {
    //    return palavrasUnicasSet.contains(palavra);
    //  }

//    public void exibirPalavrasUnicas(){
//        for (String p : palavrasUnicasSet){
//            System.out.println(p);
//        }
//    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Carangueijo");
        conjuntoPalavrasUnicas.adicionarPalavra("Cabelo");
        conjuntoPalavrasUnicas.adicionarPalavra("Borracha");
        conjuntoPalavrasUnicas.adicionarPalavra("Mussarela");

//        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Cabelo");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}
