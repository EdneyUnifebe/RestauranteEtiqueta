package etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao;

public class Categoria {

    String nomeCategoria;
    String idCategoria;
    String qtidadeProdutos;

    public Categoria(String nomeCategoria, String idCategoria, String qtidadeProdutos) {
        this.nomeCategoria = nomeCategoria;
        this.idCategoria = idCategoria;
        this.qtidadeProdutos = qtidadeProdutos;
    }

    public String getQtidadeProdutos() {
        return qtidadeProdutos;
    }

    public void setQtidadeProdutos(String qtidadeProdutos) {
        this.qtidadeProdutos = qtidadeProdutos;
    }

    public Categoria() {
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

}
