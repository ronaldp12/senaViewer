import edu.misena.senaviewer.model.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> libros = new ArrayList<>();

    public static void main(String[] args) {

        }
    public static void inicio (){
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
            switch (opcion){
                case 1:
            }

        }while(opcion == 4);
    }
    public static void addBook(Scanner scanner){
        System.out.println("Ingrese el título del libro:");
        String title = scanner.nextLine();

        System.out.println("Ingrese la fecha de edicion del libro:");
        String fecha = scanner.nextLine();
        Date edititionDate= java.sql.Date.valueOf(fecha);

        System.out.println("Ingrese la editorial del libro:");
        String editorial = scanner.nextLine();

        System.out.println("Ingrese el ISBN del libro:");
        int isbn = scanner.nextInt();

        Book libro=new Book(title,edititionDate,editorial,isbn);
        libros.add(libro);
    }
    }