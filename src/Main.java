import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Chapter;
import edu.misena.senaviewer.model.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> libros = new ArrayList<>();
    private static ArrayList<Chapter> capitulos = new ArrayList<>();
    private static ArrayList<Movie> peliculas = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        inicio();
        }
    public static void inicio () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String menu;
        int opcion;
        do {
            menu="Elija una opcion\n\n";
            menu+= "1. Movies\n";
            menu+= "2. Series\n";
            menu+= "3. Books\n";
            menu+= "4. Magazines\n";
            menu+= "5. Report\n";
            menu+= "6. Report Today\n";
            menu+= "7. Exit\n";
            System.out.println(menu);
            opcion=scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1: addBook(scanner);
                break;
                case 2: addChapter(scanner);
                break;
            }

        }while(opcion == 4);
    }
    public static void addBook(Scanner scanner) throws ParseException {
        System.out.println("Ingrese el título del libro:");
        String title = scanner.nextLine();

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
    }
    public static void addChapter(Scanner scanner){
        System.out.println("Ingrese el título del capitulo:");
        String title = scanner.nextLine();

        System.out.println("Ingrese la duracion del capitulo:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año del capitulo:");
        int year = scanner.nextInt();

        Chapter capitulo=new Chapter(title,duration,year);
        capitulos.add(capitulo);
    }

    public static void addMovie(Scanner scanner){
        System.out.println("Ingrese el título de la pelicula:");
        String title = scanner.nextLine();

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
    }


    }