package br.com.blablabla;

public class Audio {
    private String nome;
    private double duracaoEmMinutos;
    private int totReproducoes;
    private int curtidas;
    private double classificasao;
    private double classificasaoFinal;
    private int totClassificacoes;
    private boolean curtiu = false;

    public String getNome() {
        return nome;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotReproducoes() {
        return totReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificasaoFinal() {
        return classificasaoFinal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void curtir(){
        this.curtidas += 1;
        this.curtiu = true;
    }

    public void descurtir(){
        this.curtidas -= 1;
        this.curtiu = false;
    }

    public void reproduzir(){
        this.totReproducoes += 1;
    }

    public void classificar(float nota){
        this.classificasao += nota;
        this.totClassificacoes += 1;
        this.classificasaoFinal = (this.classificasao / this.totClassificacoes);
    }
}
