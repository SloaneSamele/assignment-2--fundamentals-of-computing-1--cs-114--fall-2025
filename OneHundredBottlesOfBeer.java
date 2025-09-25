import java.util.Scanner;
public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    int bottles;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a number of bottles of beers:");
    bottles = input.nextInt();
    while(bottles > 0){
      System.out.println(bottles + " bottles of beer on the wall");
      System.out.println(bottles + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      --bottles;
      if(bottles < 0){
        System.out.print("0 bottles of beer on the wall");
      }
      else{
        System.out.println(bottles + " bottles of beer on the wall");
        System.out.println();
      }
    }
    input.close();
  }
}
