import java.util.Scanner;

public class Coin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = scanner.next();
        System.out.println("Hello,"+name+"!");
        int a = (int)(Math.random()*2);
        int b = (int)(Math.random()*2);
        int c = (int)(Math.random()*2);
        int count1 = 0;
        int count2 = 0;
        System.out.println("Tossing a coin...");
       
        if(a == 0){
            System.out.println("Round 1: Heads");
            count1++;
        }
        else if(a == 1){
            System.out.println("Round 1: Tails");
            count2++;
        }
        if(b == 0){
            System.out.println("Round 2: Heads");
            count1++;
        }
        else if(b == 1){
            System.out.println("Round 2: Tails");
            count2++;
        }
        if(c == 0){
            System.out.println("Round 3: Heads");
            count1++;
        }
        else if(c == 1){
            System.out.println("Round 3: Tails");
            count2++;
        }
        System.out.println("Heads: "+count1+", Tails: "+count2);
    }
}