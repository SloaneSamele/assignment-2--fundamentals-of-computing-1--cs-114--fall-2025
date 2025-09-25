import java.util.Scanner;
public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    int bottles;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a number of bottles of beers:");
    bottles = input.nextInt();
    while(bottles > 0){
      --bottles;
    }
    input.close();
  }
}
