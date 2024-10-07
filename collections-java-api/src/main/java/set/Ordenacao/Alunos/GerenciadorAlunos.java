package main.java.set.Ordenacao.Alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(String nome){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if (a.getNome().equalsIgnoreCase(nome)){
                    alunoParaRemover = a;
                    break;
                }else {
                    System.out.println("Aluno não existe");
                }
            }
            alunoSet.remove(alunoParaRemover);
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Isak",1600364L,7.0);
        gerenciadorAlunos.adicionarAluno("Isak Silva",1600384L,7.4);
        gerenciadorAlunos.adicionarAluno("Mari",1600378L,1.0);
        gerenciadorAlunos.adicionarAluno("Mirlla",1600399L,10.0);
        gerenciadorAlunos.adicionarAluno("Lucas",1600366L,5.0);
        gerenciadorAlunos.adicionarAluno("Sueli",1600363L,8.0);

        gerenciadorAlunos.removerAluno("Isak");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
