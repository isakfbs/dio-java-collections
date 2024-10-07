package main.java.set.Pesquisa.Tarefas;

public class Tarefa {
    private String descricao;
    private boolean estaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.estaConcluida = false;
    }

    public boolean isEstaConcluida() {
        return estaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setEstaConcluida(boolean estaConcluida) {
        this.estaConcluida = estaConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", estaConcluida=" + estaConcluida +
                '}';
    }
}
