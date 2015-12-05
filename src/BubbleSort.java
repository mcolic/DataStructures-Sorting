 /* BubbleSort */
class BubbleSort {
    
    /* Bubble Sort function */
  public static void BubbleSort (int arr[]) 
  {
      int N = arr.length;
      int i, j, temp;
      
     for (i = 0; i < N; i++) 
     {
        for (j = 1; j < (N - i); j++) 
        {

            if (arr[j - 1] > arr[j]) 
            {
                /* Swap the values */
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
     }
  }
}    