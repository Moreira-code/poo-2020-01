/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucca
 */
public class Produto {
    
    private String descricao;
    private float preco;
    private float aliquota;
    
    public Produto(String descricao, float preco, float aliquota){
        
        this.aliquota=aliquota;
        this.preco=preco;
        this.descricao=descricao;
        
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public float getAliquota() {
        return aliquota;
    }
    
    
}
