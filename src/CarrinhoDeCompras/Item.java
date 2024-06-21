package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return"Carrinho :"+"nome='"+nome+'\''+
                "\n,preco='"+preco+
                "\n,quantidade='"+quantidade;
    }
}
