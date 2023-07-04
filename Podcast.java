package br.com.blablabla;

public class Podcast extends Audio{
    private String podcaster;
    private int episodio;
    private String descricao;
    private String nomePodcast;
    private int temporada;

    public String getPodcaster() {
        return podcaster;
    }

    public int getEpisodio() {
        return episodio;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomePodcast() {
        return nomePodcast;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setPodcaster(String podcaster) {
        this.podcaster = podcaster;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
