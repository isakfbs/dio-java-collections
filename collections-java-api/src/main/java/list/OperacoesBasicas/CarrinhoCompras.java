package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itemList;

    public CarrinhoCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        itemList.add(new Item(nome,quantidade,preco));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item i : itemList){
            total += i.getPreco();
        }
        return total;
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        }else{
            System.out.println("Carrinho vazio!");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("Garrafa",10,5.00);
        carrinhoCompras.adicionarItem("Estojo",10,5.00);
        carrinhoCompras.adicionarItem("Caderno",10,5.00);
        carrinhoCompras.adicionarItem("Livro",10,5.00);
        carrinhoCompras.adicionarItem("Lápis",10,5.00);
        carrinhoCompras.removerItem("Garrafa");

        carrinhoCompras.exibirItens();
        System.out.println(carrinhoCompras.calcularValorTotal());
    }
}
