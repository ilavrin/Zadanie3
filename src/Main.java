import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomLavrinenko = new Random();
        int randomValueLavrinenko = randomLavrinenko.nextInt(100)+1;
        System.out.println("The new random value is "+randomValueLavrinenko);
        if (randomValueLavrinenko % 2 == 0){
            System.out.println("The number "+randomValueLavrinenko+" is even");
        }
        else{
            System.out.println("The number "+randomValueLavrinenko+" is odd");
        }
    }
}