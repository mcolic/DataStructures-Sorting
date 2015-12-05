import java.util.Scanner;
public class main
{
/* Main function */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Sort Test\n");
        int n, i;
        /* Ask for number of elements */
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /* create an array with the number of elements */
        int arr[] = new int[ n ];
        /* Ask user of n number of the elements */
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /* Call sorting functions */
        SelectionSort a = new SelectionSort();
        SelectionSort.SelectionSort(arr);
        System.out.println("\nElements after sorting with SelectionSort ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println(); 
        InsertionSort b = new InsertionSort();
        InsertionSort.InsertionSort(arr);
        System.out.println("\nElements after sorting with InsertionSort ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println(); 
        BubbleSort c = new BubbleSort();
        BubbleSort.BubbleSort(arr);
        System.out.println("\nElements after sorting with BubbleSort ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();                     
    }    

}