//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

import java.util.*;

class A {
  public static void main(String[] args) {
    int array[] = {1, 2, 3, 4, 5, 6, 7};
    int n = array.length;
    
    shuffle(array);
   
    int shuffledArray[] = new int[n];
    
    for(int i=0;i<array.length;i++){
      shuffledArray[i] =  array[i];
    }
    System.out.println(Arrays.toString(shuffledArray));
    
  }

  public static void shuffle(int[] array){
    
    int lengthArray = array.length;
    
    Random random = new Random();

    for(int i=0;i<lengthArray;i++){
      int index1 = random.nextInt(lengthArray);
      int index2 = random.nextInt(lengthArray);

      int temp  = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
      
    }
  }
}
