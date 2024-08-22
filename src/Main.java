import edu.misena.senaviewer.model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> libros = new ArrayList<>();
    private static ArrayList<Chapter> capitulos = new ArrayList<>();
    private static ArrayList<Movie> peliculas = new ArrayList<>();
    private static ArrayList<Serie> series = new ArrayList<>();
    private static ArrayList<Magazine> revistas = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        inicio();
        }
    public static void inicio () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String menu, continuar;
        int opcion;
        do {
            menu="Elija una opcion\n\n";
            menu+= "1. Movies\n";
            menu+= "2. Series\n";
            menu+= "3. Books\n";
            menu+= "4. Magazines\n";
            menu+= "5. Chapter\n";
            menu+= "6. Report\n";
            menu+= "7. Report Today\n";
            menu+= "0. Exit\n";
            System.out.println(menu);
            opcion=scanner.nextInt();
            scanner.nextLine();
            switch (opcion){

                case 0: scanner.close();

                case 1:
                    menu="Elija una opcion\n\n";
                    menu+= "1.Agregar Pelicula\n";
                    menu+= "2.Mostrar Peliculas\n";
                    System.out.println(menu);
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1: addMovie(scanner);
                        break;
                        case 2: System.out.println(peliculas);
                        default: System.out.println("Opcion invalida");
                        break;
                    }

                break;
                case 2:
                    menu="Elija una opcion\n\n";
                    menu+= "1.Agregar Serie\n";
                    menu+= "2.Mostrar Series\n";
                    System.out.println(menu);
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1: addSerie(scanner);
                            break;
                        case 2: System.out.println(series);
                        default: System.out.println("Opcion invalida");
                            break;
                    }
                break;
                case 3:
                    menu="Elija una opcion\n\n";
                    menu+= "1.Agregar libro\n";
                    menu+= "2.Mostrar libros\n";
                    System.out.println(menu);
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1: addBook(scanner);
                            break;
                        case 2: System.out.println(libros);
                        default: System.out.println("Opcion invalida");
                            break;
                    }
                case 4:
                    menu="Elija una opcion\n\n";
                    menu+= "1.Agregar Revista\n";
                    menu+= "2.Mostrar Revistas\n";
                    System.out.println(menu);
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1: addMagazine(scanner);
                            break;
                        case 2: System.out.println(revistas);
                        default: System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 5:
                    menu="Elija una opcion\n\n";
                    menu+= "1.Agregar Capitulo\n";
                    menu+= "2.Mostrar Capitulos\n";
                    System.out.println(menu);
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1: addChapter(scanner);
                            break;
                        case 2: System.out.println(capitulos);
                        default: System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                default:System.out.println("Opcion invalida");
                break;
            }
            System.out.print("Desea continuar 1=Si/2=No ");
            continuar= scanner.nextLine();

        }while(continuar == "si");
    }


    public static void addBook(Scanner scanner) throws ParseException {
        System.out.println("Ingrese el título del libro:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de edicion del libro:");
        String fecha = scanner.nextLine();
        SimpleDateFormat convertir = new SimpleDateFormat("dd/MM/yyyy");
        Date edititionDate= convertir.parse(fecha);

        System.out.println("Ingrese la editorial del libro:");
        String editorial = scanner.nextLine();

        System.out.println("Ingrese el ISBN del libro:");
        int isbn = scanner.nextInt();
        scanner.nextLine();

        Book libro=new Book(title,edititionDate,editorial,isbn);
        libros.add(libro);
        System.out.println("Libro agregado con exito");
    }
    public static void addChapter(Scanner scanner){
        System.out.println("Ingrese el título del capitulo:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese la duracion del capitulo:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año del capitulo:");
        int year = scanner.nextInt();

        Chapter capitulo=new Chapter(title,duration,year);
        capitulos.add(capitulo);
        System.out.println("Capitulo agregado con exito");
    }

    public static void addMovie(Scanner scanner){
        System.out.println("Ingrese el título de la pelicula:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el genero de la pelicula:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese el creador de la pelicula:");
        String creator = scanner.nextLine();

        System.out.println("Ingrese la duracion de la pelicula:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año de la pelicula:");
        int year = scanner.nextInt();

        Movie pelicula=new Movie(title,genre,creator,duration);
        peliculas.add(pelicula);
        System.out.println("Pelicula agregada con exito");
    }

    public static void addSerie(Scanner scanner){
        System.out.println("Ingrese el título de la serie:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el genero de la serie:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese la duracion de la serie:");
        int duration = scanner.nextInt();

        Serie serie=new Serie(title,genre,duration);
        series.add(serie);
        System.out.println("Serie agregada con exito");
    }

    public static void addMagazine(Scanner scanner) throws ParseException {
        System.out.println("Ingrese el título de la revista:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de edicion de la revista:");
        String fecha = scanner.nextLine();
        SimpleDateFormat convertir = new SimpleDateFormat();
        Date edititionDate= convertir.parse(fecha);

        System.out.println("Ingrese la editorial de la revista:");
        String editorial = scanner.nextLine();

        Magazine revista=new Magazine(title,edititionDate,editorial);
        revistas.add(revista);
        System.out.println("Revista agregada con exito");
    }


    }