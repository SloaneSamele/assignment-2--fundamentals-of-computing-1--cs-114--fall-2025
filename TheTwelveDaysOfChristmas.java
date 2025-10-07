public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    System.out.println("---The Tweleve days of Christmas---\n");
    
    for(int day = 1; x <= 12; day++){
      if(day == 1){
        System.out.println("On the "+ x + "st day of Christmas, my true love gave to me");
      }
      else if(day == 2){
        System.out.println("On the "+ x + "nd day of Christmas, my true love gave to me");
      }
      else if(day == 3){
        System.out.println("On the "+ x + "rd day of Christmas, my true love gave to me");
      }
      else{
      System.out.println("On the "+ x + "th day of Christmas, my true love gave to me");
      }
      
      switch(day){
        case 12:
          System.out.println("Tweleve drummers drumming,");

        case 11:
          System.out.println("Eleven pipers piping,");
        
        case 10:
          System.out.println("Ten lords a-leaping,");
        
        case 9:
          System.out.println("Nine ladies dancing,");
        
          case 8:
          System.out.println("Eight maids a-milking,");
        
        case 7:
          System.out.println("Seven swans a-swiming,");
        
        case 6:
          System.out.println("Six geese a-laying,");
      
        case 5:
          System.out.println("Five golden rings,");
        
        case 4:
          System.out.println("Four calling birds,");
        
        case 3:
          System.out.println("Three french hens,");
       
        case 2:
          System.out.println("Two turtle doves, and");
        
        case 1:
          System.out.println("A partrigde in a pear tree.\n");

          break;
          
      }
    }
  }
}
