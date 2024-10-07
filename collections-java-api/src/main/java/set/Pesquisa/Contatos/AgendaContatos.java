package main.java.set.Pesquisa.Contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Isak",999826379);
        agendaContatos.adicionarContato("Isak Silva",6379);
        agendaContatos.adicionarContato("Sueli",999826244);
        agendaContatos.adicionarContato("Mariana",999825452);
        agendaContatos.adicionarContato("Celia",999823453);
        agendaContatos.adicionarContato("Mirlla",999821243);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Isak"));
    }

}
