package CarrinhoDeCompras;

public class main{
    public static void main(String[] args){
        Carrinho carro = new Carrinho();
        carro.adicionarItem("brinquedo", 10.99, 4);
        carro.adicionarItem("Disco",18.90,98);
        carro.removerItem("brinquedo");
        carro.exibirItemList();
        System.out.printf("\n O valor total da compra é %.2f", carro.calcularValorTotal());
    }
}
