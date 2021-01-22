package pmpoo;
/**
 *
 * @author alfre
 */
import java.util.Scanner;
public class Producto {
    
    Scanner teclado=new Scanner(System.in);//esto es para llamar al teclado
    private double precio;
    private String artista;
    private int canciones;
    private double duracion;

    public Producto() {
    }

    public Producto(double precio, 
            String artista, int canciones, 
            double duracion) {
        this.precio = precio;
        this.artista = artista;
        this.canciones = canciones;
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Album:\n" + "\tPrecio: $" +precio
                + "\n\tArtista: " +
                artista+ "\n\tCanciones: " +canciones
                + "\n\tDuracion: "+duracion;
    }
    
    
}
