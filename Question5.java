import java.util.Scanner;

public class Question5
{
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Prompt the user for the number of elements
    //System.out.print("Enter the number of elements: ");
    int numElements = in.nextInt();

    // Declare the array to store the integers
    int[] arr = new int[numElements];

    // Get the integers from the user
    //System.out.println("Enter the integers:");
    for (int i = 0; i < numElements; i++) {
      arr[i] = in.nextInt();
    }

    // Find the mode using a separate function
    int mode = findMode(arr);

    // Print the mode
    System.out.println(mode);

    in.close(); // Close the Scanner to avoid resource leaks
  }

  // Function to find the mode of an array
  public static int findMode(int[] arr) {
    int maxValue = 0;
    int maxCount = 0;

    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        maxValue = arr[i];
      }
    }

    return maxValue;
  }
}
