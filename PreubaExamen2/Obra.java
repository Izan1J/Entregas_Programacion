package PreubaExamen2;

public class Obra{
    String titulo;
    String tipo;
    static int precio;
    static int anyo;
    String artista;

    public Obra(String titulo, String tipo, int precio, int anyo,String artista) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.precio = precio;
        this.anyo = anyo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public static int getPrecio() {
        return precio;
    }

    public static int getAnyo() {
        return anyo;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return titulo +", "+ tipo+", "+ precio+"M, " + anyo+", "+artista;
    }


}
