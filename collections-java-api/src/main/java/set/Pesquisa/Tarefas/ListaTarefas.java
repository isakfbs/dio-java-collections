package main.java.set.Pesquisa.Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }else{
                    System.out.println("Tarefa não existe");
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet){
                if (t.isEstaConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet){
                if (!t.isEstaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setEstaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarPendente != null){
            if (tarefaParaMarcarPendente.isEstaConcluida()){
                tarefaParaMarcarPendente.setEstaConcluida(false);
            }
        }else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if (tarefasSet.isEmpty()){
            System.out.println("A lista já está vazia");
        }else {
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Beber água");
        listaTarefas.adicionarTarefa("Correr");
        listaTarefas.adicionarTarefa("Ler");
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Correr");

        listaTarefas.exibirTarefas();

        System.out.println(listaTarefas.contarTarefas());

    }
}
