import br.com.blablabla.Musica;
import br.com.blablabla.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica Roots = new Musica();
        Podcast RS1 = new Podcast();

        Roots.setNome("Roots");
        Roots.setArtista("Imagine Dragons");
        Roots.setAlbum("Roots");
        Roots.reproduzir();
        Roots.curtir();
        Roots.classificar(10);

        RS1.setNome("azul-escuro");
        RS1.setPodcaster("Radio");
        RS1.setEpisodio(1);
        RS1.setNomePodcast("Universe City");
        RS1.setDescricao("Em perigo. Preso na Universe City. Mandem ajuda.");
        RS1.setTemporada(1);
        RS1.reproduzir();
        RS1.curtir();
        RS1.classificar(10);
        }
    }