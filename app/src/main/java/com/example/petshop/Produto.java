package com.example.petshop;

public class Produto {
    private String nomeProduto;
    private String descProduto;
    private float precProduto;
    private int idCategoria;
    private int qtdMinEstoque;
    private boolean ativoProduto;
    private int idProduto;
    private float descontoPromocao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPrecProduto() {
        return precProduto;
    }

    public void setPrecProduto(float precProduto) {
        this.precProduto = precProduto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getQtdMinEstoque() {
        return qtdMinEstoque;
    }

    public void setQtdMinEstoque(int qtdMinEstoque) {
        this.qtdMinEstoque = qtdMinEstoque;
    }

    public boolean isAtivoProduto() {
        return ativoProduto;
    }

    public void setAtivoProduto(boolean ativoProduto) {
        this.ativoProduto = ativoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public float getDescontoPromocao() {
        return descontoPromocao;
    }

    public void setDescontoPromocao(float descontoPromocao) {
        this.descontoPromocao = descontoPromocao;
    }
}

