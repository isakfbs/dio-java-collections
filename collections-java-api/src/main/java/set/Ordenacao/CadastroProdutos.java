package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco,int quantidade){
        produtoSet.add(new Produto(nome,codigo,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123124L,"Celular",2,14);
        cadastroProdutos.adicionarProduto(126224L,"TV",3,2);
        cadastroProdutos.adicionarProduto(12224L,"Camera",4,6);
        cadastroProdutos.adicionarProduto(123161L,"Tablet",5,23);
        cadastroProdutos.adicionarProduto(1236624L,"LapTop",6,3);
        cadastroProdutos.adicionarProduto(1262634L,"Scanner",7,10);

//        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}
