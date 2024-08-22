import edu.misena.senaviewer.model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        inicio();
        }
    public static void inicio () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String menu;
        int opcion, continuar;
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
                        case 1: Movie.addMovie(scanner);
                        break;
                        case 2: System.out.println();
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
                        case 1: Serie.addSerie(scanner);
                            break;
                        case 2: System.out.println();
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
                        case 1: Book.addBook(scanner);
                            break;
                        case 2: System.out.println();
                        default: System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 4:
                    menu="Elija una opcion\n\n";
                    menu+= "1.Agregar Revista\n";
                    menu+= "2.Mostrar Revistas\n";
                    System.out.println(menu);
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1: Magazine.addMagazine(scanner);
                            break;
                        case 2: System.out.println();
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
                        case 1: Chapter.addChapter(scanner);
                            break;
                        case 2: System.out.println();
                        default: System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                default:System.out.println("Opcion invalida");
                break;
            }
            System.out.print("Desea continuar 1=Si/2=No ");
            continuar= scanner.nextInt();

        }while(continuar == 1);
    }

    }