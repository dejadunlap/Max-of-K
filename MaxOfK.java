/**
*@Author: Deja Dunlap
*@Date: 2/12/2021
*@ Given an array B of size N and an integer K, this class find the maximum for each adn every contingous subarray of size k
*/
public class MaxOfK {

  private int[] myArray;
  private int subLength;

  public MaxOfK (int arrayLength, int subsection){
    myArray = new int[arrayLength];
    subLength = subsection;
  }

/**
*fills an array with random numbers
*Precondition: subLength > 0
*Postcondintion: int[] myArray
*Parameters: None
*/
  public void fillArray (){
    int length = 0; 
    while (length < myArray.length){
      int random = (int)(Math.random() * 8) + 1;
      myArray[length] = random;
      length++;
    }
    for (int i = 0; i < myArray.length; i++){
      System.out.print(myArray[i] + " ");
    }
    System.out.println();
  }

/**
*divides the array into subsarrays
*Precondition: myArray.length > 0, subLength > 0
*Postcondintion: none
*Parameters: None
*/
  public void divideSection (){
    int start = 0;
    int[] subArray = new int[subLength];
    //divides the array into subsections
    while ((start + subLength - 1) < myArray.length)
    {
      for (int i = start; i <= start + subLength -1; i++){
        if (i == start){
          subArray[0] = myArray[i];
        } else if (i == start + 1){
          subArray[1] = myArray[i];
        } else {
          subArray[2] = myArray[i];
        }
      }
        //prints out the subsections
        for (int i = 0; i < subArray.length; i++){
          System.out.print(subArray[i] + " ");
        } 
      System.out.println();
      findMax(subArray);
      System.out.println();
      start++;
    }
  } 

/**
*finds the greatest number in the subsection
*Precondition: testArray.length > 0
*Postcondintion: greatest
*Parameters: int[] testArray
*/
    public void findMax (int[] testArray){
      int greatest = 0;
      for (int i = 0; i < testArray.length; i++){
        if (testArray[i] > greatest){
          greatest = testArray[i];
        }
      }
      System.out.print("The greatest is: " + greatest);
    }
}
