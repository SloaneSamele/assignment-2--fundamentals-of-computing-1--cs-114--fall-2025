public class CountFlips {
  public static void main(String[] args) {
    Coin myCoin = new Coin();
    int heads = 0, tails = 0;
  
    for(int x = 0; x != 100; x++){
      myCoin.flip();
      if(myCoin.isHeads()){
        ++heads;
      }
      else{
        ++tails;
      }
    }
    System.out.print("Heads :" + heads +"\n" +"Tails :" + tails);
  }
}
