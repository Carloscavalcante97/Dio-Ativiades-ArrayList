package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
private List<Item> itemList;

public Carrinho(){
    itemList = new ArrayList<>();
}

public void adicionarItem(String nome, double preco, int quantidade){
    Item item = new Item(nome , preco , quantidade);
    this.itemList.add(item);
}
public void removerItem(String nome){

    if(!itemList.isEmpty()){
        for(Item item: itemList){
            if(item.getNome().equals(nome)){
               itemList.remove(item);
            }
        }
    }else System.out.print("Sem intens a remover.");
}
public double calcularValorTotal(){
 double valorTotal = 0;
 double quantidadeTotal = 0;
 if(!itemList.isEmpty()) {
     for (Item item : itemList) {
         valorTotal += item.getPreco();
         quantidadeTotal = valorTotal * item.getQuantidade();
     }return quantidadeTotal;
 }else throw new RuntimeException("A lista está vázia");
    }
public void exibirItemList(){
 if(!itemList.isEmpty()){
     System.out.print(itemList);
 }else System.out.print("Lista Vazia");
}
@Override
    public String toString() {
    return "CarrinhoDeCompras{"+"itemList=" + itemList + '}';
}
}
