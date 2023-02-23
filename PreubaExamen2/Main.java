package PreubaExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Artista> artistas =new ArrayList<>();
    static ArrayList<Obra> obras = new ArrayList<>();
    public static void main(String[] args) {
        Artista art1=new Artista("Leonardo da Vinci","italiano");
        Artista art2=new Artista("Pablo Picasso","español");
        Artista art3=new Artista("Auguste Rodin","francés");
        artistas.add(art1);
        artistas.add(art2);
        artistas.add(art3);
        Obra o1=new Obra("Salvator Mundi","óleo sobre madera",450,1500,art1.getNombre());
        Obra o2=new Obra("La Gioconda","óleo sobre madera",870,1503,art1.getNombre());
        Obra o3=new Obra("El pensador","escultura",11,1904,art3.getNombre());
        Obra o4=new Obra("El sueño"," óleo sobre lienzo",155,1932,art2.getNombre());
        Obra o5=new Obra("El Guernica"," óleo sobre lienzo",2000,1937,art2.getNombre());
        obras.add(o1);
        obras.add(o2);
        obras.add(o3);
        obras.add(o4);
        obras.add(o5);
        art1.addNewObra(o1);
        art1.addNewObra(o2);
        art2.addNewObra(o3);
        art3.addNewObra(o4);
        art3.addNewObra(o5);
        System.out.println("""
                1 - Añadir obra
                2 - Añadir artista
                3 - Buscar obra por nombre
                4 - Buscar obra por artista
                5 - Eliminar obra
                6 - Encontrar obra más barata
                7 - Encontrar obra más moderna
                8 - Salir""");
        boolean continuar=true;

        while(continuar){
            Scanner st=new Scanner(System.in);
            System.out.print("Elija una opcion: ");
            int opcion= st.nextInt();
            switch (opcion){
                case 1 ->{
                    añadir();
                }
                case 2 ->{
                    artistas.add(Artista.createArtista());
                }
                case 3 ->{
                    Artista.findNombre();
                }
                case 4 ->{
                    Artista.findArtista();
                }
                case 5 ->{
                    Artista.removeObra();
                }
                case 6 ->{

                }
            }
        }
    }
    public static void añadir(){
        Scanner sc =new Scanner(System.in);
        Scanner st =new Scanner(System.in);
        System.out.println("Añadir nueva obra:");
        System.out.print("Titulo: ");
        String tit= sc.nextLine();
        System.out.print("Tipo: ");
        String tipo= sc.nextLine();
        System.out.print("Precio(en millones): ");
        int precio=st.nextInt();
        System.out.print("Año: ");
        int anyo= st.nextInt();
        System.out.print("Artista: ");
        String art= sc.nextLine();
    }
}
