public class ninetyNine {

  public static void main(String[] args){
  
  // Initializes variable
  int bottles = 99;
  

    while (bottles > 0) {
      System.out.println(bottles + " bottles of beer on the wall,");
      System.out.println(bottles + " bottles of beer.");
      System.out.println("Take one down and pass it around:");
      bottles = bottles - 1;
      System.out.println(bottles + " bottles of beer on the wall.\n\n");      
    } // End of while-loop

  }// End of main()

}