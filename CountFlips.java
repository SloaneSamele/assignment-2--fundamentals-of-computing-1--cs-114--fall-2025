public class CountFlips {
  public static void main(String[] args) {
    
    int heads = 0, tails = 0;
    Coin myCoin = new Coin();

    for(int x = 0; x != 100; x++){
      myCoin.flip();
      if(myCoin.isHeads()){
        ++heads;
      }
      else{
        ++tails;
      }
    }
    System.out.print("Heads : " + heads +"\n" +"Tails : " + tails);
  }
}
