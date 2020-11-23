public class itemNotaFiscal{
    
    private Produto produto;
    private int quantidade;

    public itemNotaFiscal(Produto produto, int quantidade){
        
        this.produto = produto;
        this.quantidade = quantidade;
        
    }
    
    public float getTotal(){
        
        //Recupere o preço do produto referenciado pelo item (preço)
        //Recupere a alíquota do produto referenciado pelo item (alíquota)
        //Calcule precoComImposto = preço * (1 + alíquota)
        //Calcule total do item: quantidade * precoComImposto 
        
        float precoComImposto = produto.getPreco() * (1 + produto.getAliquota());
        return quantidade * precoComImposto;
        
     
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    
    
}
