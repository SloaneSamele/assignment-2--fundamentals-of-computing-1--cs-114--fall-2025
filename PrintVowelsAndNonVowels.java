import java.util.Scanner;
public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    String message;
    int a = 0,e = 0,i = 0,o = 0,u = 0,other= 0;
    Scanner input = new Scanner(System.in);
    
    System.out.println("--Vowel Counter--");
    System.out.print("Please enter a message: ");
    message = input.nextLine();
    input.close();
    
    for(int x = 0; x < message.length(); ++x){
      switch (message.charAt(x)) {
        case 'a':
          ++a;
          
          break;
        
        case 'e':
          ++e;
          
          break;
        
        case 'i':
          ++i;
          
          break;
        
        case 'o':
          ++o;
          
          break;
        
        case 'u':
          ++u;
          
          break;
        
        default:
          ++other;
          
          break;
      }
    }
    
    System.out.println("a: " + a);
    System.out.println("e: " + e);
    System.out.println("i: " + i);
    System.out.println("o: " + o);
    System.out.println("u: " + u);
    System.out.println("other: " + other);
  }
}
