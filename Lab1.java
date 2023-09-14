import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int BOOK_AMOUNT = in.nextInt();
        in.nextLine();
         //Creates an array of book information
         //inputted as author[0], title[1], isbn[2]
        ArrayList<String> books = new ArrayList<String>(BOOK_AMOUNT);
        for (int i = 0; i < BOOK_AMOUNT*3; i++) {
            books.add(in.nextLine());
        }
        
        int BOOK_CHANGES = in.nextInt();
        in.nextLine();

        ArrayList<String> storage = new ArrayList<String>();
        storage.addAll(books);

        

        //Book isbn and availability or inputted based on amount of book changes
        for (int i = 0; i < BOOK_CHANGES; i++) {
            String isbn = in.nextLine();
            String status = in.nextLine();
            int pos = books.indexOf(isbn);
            //Removes associated book if "out" is followed after its isbn
            if (status.equals("out")) {
                for (int j = 0; j < 3; j++) {
                    books.remove(pos-j);
                }
            } else if (status.equals("in")){
                if (books.contains(isbn) == false && storage.contains(isbn) == true) {
                    // System.out.println("The isbn is not in the books array but is in the storage array!");
                    int posBackup = storage.indexOf(isbn);
                    for (int j = 2; j >= 0; j--) {
                        books.add((posBackup - j), storage.get(posBackup - j));
                    }
                } 
            }
        }
        in.close();

        //Prints final available books
        int BOOKS_FINAL = books.size();
        for (int i = 0; i < BOOKS_FINAL; i+=3) {
            System.out.print(books.get(i) + ", ");
            System.out.print(books.get(i+1) + ", ");
            System.out.print(books.get(i+2) + "\n");
        }
    }
}

