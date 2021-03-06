package pmpoo;
/**
 *
 * @author alfre
 */
import java.util.Scanner;
public class Cliente {
    
    Scanner teclado=new Scanner(System.in);//esto es para llamar al teclado
    private String nombre;
    private int edad;
    private String correo;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente\n" + "Nombre: " +nombre+ 
                "\nEdad: " + edad + "\nCorreo: " 
                + correo;
    }   
}
