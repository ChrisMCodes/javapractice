import java.util.Scanner;
import java.io.*;

public class KittyStory {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(new File("KittyStory.txt"));

        String cat;
        String color;
        String age;
        String favoriteToy;
        String sound;

        System.out.println("Enter the cat's name: ");
        cat = sc.next();
        System.out.println("Enter " + cat + "'s color: ");
        color = sc.next();
        System.out.println("Enter " + cat + "'s age: ");
        age = sc.next();
        System.out.println("Enter " + cat + "'s favorite toy: ");
        favoriteToy = sc.next();
        System.out.println("What sound does " + cat + " make?");
        sound = sc.next();

        String message = "Once there was a" + color + " cat named " + cat + ".\n" +
                cat + " is " + age + " years old and loves to play with a " + favoriteToy +
                ".\n" + "When " + cat + " is being cute, " + cat + " emits a \n\n" + sound.toUpperCase() +
                "\n\nand smiles and blinks slowly at me.\n" + cat + " is my best friend and always falls " +
                "asleep on my lap.\n\nI sure do love " + cat + "!";

        fw.write(message);

        System.out.println("There is now a text document in the open folder called KittyStory.txt -- go ahead and open it!");

	String goOn = sc.nextLine();

        sc.close();
        fw.close();
    }
}
