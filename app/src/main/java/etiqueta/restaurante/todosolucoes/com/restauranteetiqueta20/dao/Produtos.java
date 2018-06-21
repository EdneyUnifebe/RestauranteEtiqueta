package etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao;

public class Produtos {
    String nomeCategoria;
    String idCategoria;
    String qtidadeProdutos;

    public Produtos(String nomeCategoria, String idCategoria, String qtidadeProdutos) {
        this.nomeCategoria = nomeCategoria;
        this.idCategoria = idCategoria;
        this.qtidadeProdutos = qtidadeProdutos;
    }

    public Produtos() {
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getQtidadeProdutos() {
        return qtidadeProdutos;
    }

    public void setQtidadeProdutos(String qtidadeProdutos) {
        this.qtidadeProdutos = qtidadeProdutos;
    }
}
