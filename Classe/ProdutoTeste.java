package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		// Primeira criação de objetos
        Produto p1 = new Produto("Notebook", 4356.89);
        
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        
        Produto.desconto = 0.29;
        
        System.out.println(p1.nome);	
        System.out.println(p2.nome);	
        
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1) ;
	    double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
	    
	    
	    System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

	}
}
