import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Lab2 creates a list of pets each with a name, type, and price. The amount of pets is determined by n.
Input is as follows:
n
name
type
price
3 previous lines repeat n times
 */
public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int AMOUNT_OF_PETS = in.nextInt();
        in.nextLine();

        ArrayList<Pet> petList = new ArrayList<>();

        for (int i = 0; i < AMOUNT_OF_PETS; i++) {
            String name = in.nextLine();
            String type = in.nextLine();
            double price = in.nextDouble();
            in.nextLine();
            petList.add(new Pet(name, type, price));
        }

        Collections.sort(petList);

        System.out.printf("%-10s%10s%10s%n", "Pet name", "Type", "Price");
        for(Pet i: petList) {
            i.printPets();
        }
    }
}

