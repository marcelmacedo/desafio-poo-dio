package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    /* Esta constante esta protegia e so pode ser acessada pelas classes filhas */
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    /* As classes que extenderem de conteudo serao obrigados a implementar uma logica no metodo calculaXp()  */
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
