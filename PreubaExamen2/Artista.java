package PreubaExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Artista{
    static Scanner sc = new Scanner(System.in);
    String nombre;
    String pais;

    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    static ArrayList<Obra> obras = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }
    public static Obra createObra(String titulo, String tipo, int precio, int anyo,String artista){
        return new Obra(titulo, tipo, precio, anyo, artista);
    }
    public static Artista createArtista(){
        System.out.println("Añadir un nuevo artista:");
        System.out.print("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("Nacionalidad: ");
        String pais=sc.nextLine();
        return new Artista(nombre,pais);
    }
    private int findObra(Obra obra){
        int index = obras.indexOf(obra);
        if (index >=0) {
            return index;
        }
        else
            return -1;
    }
    public static int findNombre(){
        System.out.print("Introduzca el nombre de la obra: ");
        String tit=sc.nextLine();
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getTitulo().equals(tit)){
                System.out.println(obras.get(i).toString());
                return i;
            }
        }
        return -1;
    }
    public static int findArtista(){
        System.out.print("Introduzca el nombre del artista: ");
        String art=sc.nextLine();
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getArtista().toLowerCase().equals(art.toLowerCase())){
                System.out.println(obras.get(i).toString());
            }
        }
        return -1;
    }
    public boolean addNewObra(Obra obra){
        if (findObra(obra) == -1){
            obras.add(obra);
            return true;
        }
        else{
            System.out.println("Esta obra ya está en la lista.");
            return false;
        }
    }
    public static boolean removeObra(){
        if (obras.isEmpty()){
            System.out.println("No existen obras");
        }else {
            System.out.print("Nombre de la obra que desea eliminar: ");
            String vuelo = sc.nextLine();
            for (int i = 0; i < obras.size(); i++) {
                if (obras.get(i).getTitulo().equals(vuelo)) {
                    System.out.println(obras.get(i).getTitulo()+" eliminada.");
                    int index = obras.indexOf(vuelo);
                    obras.remove(index);
                    return true;
                } else {
                    System.out.println("El numero de vuelo no existe");
                    break;
                }
            }
        }
        return false;
    }
}
