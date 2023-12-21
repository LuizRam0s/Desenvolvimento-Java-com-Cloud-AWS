package Collections.java.API2023.list.exercicios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhosDeCompras {
    private List<Item> itemCarrinho;

    public CarrinhosDeCompras(){
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade){
        itemCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void  removerItemPeloNome(String nome) {
        List<Item> removerItem = new ArrayList<>();
        if (!itemCarrinho.isEmpty()) {
            for (Item t : itemCarrinho) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    removerItem.add(t);
                }
            }
                    itemCarrinho.removeAll(removerItem);
                } else {
                    System.out.println("Lista Vazia");
        }
    }
    public float calcularValorTotal(){
        float valorTotal = 0f;
        if (!itemCarrinho.isEmpty()){
            for (Item item: itemCarrinho) {
             float valorItem = item.getPreco() * item.getQuantidade();
             valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemCarrinho.isEmpty()) {
            System.out.println(this.itemCarrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhosDeCompras carrinhosDeCompras = new CarrinhosDeCompras();
        carrinhosDeCompras.adicionarItem("Quadro", 15.8f, 3);
        carrinhosDeCompras.adicionarItem("Lápis", 2f, 3);
        carrinhosDeCompras.adicionarItem("Livro", 35.4f, 1);
        carrinhosDeCompras.adicionarItem("Borracha", 2f, 2);

        carrinhosDeCompras.exibirItens();

        carrinhosDeCompras.removerItemPeloNome("Quadro");
        carrinhosDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhosDeCompras.calcularValorTotal());
    }
}
