public class CountFlips {
  public static void main(String[] args) {
    
    int heads = 0;
    Coin myCoin = new Coin();

    for(int x = 0; x != 100; x++){
      myCoin.flip();
      if(myCoin.isHeads()){
        ++heads;
      }

    }
    System.out.println("Out of 100 coin clips you got");
    System.out.print("Heads : " + heads +"\n" +"Tails : " + (100 - heads));
  }
}
