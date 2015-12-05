/* InsertionSort */
public class InsertionSort 
{
    /* Insertion Sort function */
    public static void InsertionSort( int arr[] )
    {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = arr[i];   
            /* Shift larger value to the right */
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;            
        }        
    }
}