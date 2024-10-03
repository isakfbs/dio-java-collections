package main.java.list.Ordenacao.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return  pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome1",20,1.68);
        ordenacaoPessoa.adicionarPessoa("nome2",32,1.56);
        ordenacaoPessoa.adicionarPessoa("nome3",43,1.90);
        ordenacaoPessoa.adicionarPessoa("nome4",12,1.78);
        ordenacaoPessoa.adicionarPessoa("nome5",13,1.65);
        ordenacaoPessoa.adicionarPessoa("nome6",53,1.60);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}
