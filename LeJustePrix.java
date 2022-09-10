package maous.xyz;

import java.util.Random;
import java.util.Scanner;

public class LeJustePrix {
    public static void main(String args[]){

        Random random = new Random();
        int n = (300000 - 1) + 1;
        int price = 100 + random.nextInt(300000-100 + 1);

        //System.out.println(price);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour, veuillez entrer une somme (entre 1 et 300000) : ");

        int entree_clavier = scanner.nextInt();
        while(price != entree_clavier){
            if(price < entree_clavier){
                System.out.println("Le prix que vous avez mis est élevé, réessayez et entrez le prix :");
                entree_clavier = scanner.nextInt();
            }
            else if(price > entree_clavier){
                System.out.println("Le prix que vous avez mis est faible, réessayez et entrez le prix :");
                entree_clavier = scanner.nextInt();
            }
            else if (price == entree_clavier){
                break;
            }
        }
        System.out.println("Bravo, le prix était de " + price + " €");
    }
}
