package br.com.blablabla;

public class Musica extends Audio{
    private String artista;
    private String album;

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
