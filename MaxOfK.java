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
*finds the max of each subsection
*Precondition: myArray.length > 0, subLength > 0
*Postcondintion: none
*Parameters: None
*/
  public void findMax (){
    int start = 0;
    //checks if there's enough of the array to create a subsection
    while ((start + subLength - 1) < myArray.length)
    {
      int greatest = 0;
      for (int i = 0; i < subLength; i++){
          if (myArray[i + start] > greatest){
          greatest = myArray[i + start];
        }
      }
      System.out.print(greatest + " ");
      start++;
      }
    }
}
