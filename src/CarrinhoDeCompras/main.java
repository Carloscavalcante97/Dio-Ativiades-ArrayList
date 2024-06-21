package CarrinhoDeCompras;

public class main{
    public static void main(String[] args){
        Carrinho carro = new Carrinho();
        carro.adicionarItem("brinquedo", 10.99, 2);
        carro.adicionarItem("Disco",18.90,1);
        carro.adicionarItem("Carrinho",22.90,1);
        carro.compararMaiorQuantidade();
        carro.exibirItemList();
        System.out.printf("\n O valor total da compra é %.2f", carro.calcularValorTotal());
    }
}
