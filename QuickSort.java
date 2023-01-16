import java.util.*;
public class QuickSort {  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        int i;  
        System.out.println("Enter the Number of Elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the  Elements:");
        for(i=0;i<n;i++)8
        
        arr[i]=sc.nextInt();
        quickSort(arr, 0, n-1);  
        System.out.println("\n The sorted array is: \n");  
        for(i=0;i<n;i++)  
            System.out.print(arr[i]+" ");  
    }  

    public static int partition(int a[], int beg, int end)  
    {  

        int left, right, temp, loc, flag;     
        loc = left = beg;  
        right = end;  
        flag = 0;  
        while(flag != 1)  
        {  
            while((a[loc] <= a[right]) && (loc!=right))  
                right--;  
            if(loc==right)  
                flag =1;  
            else if(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                    left++;  
                if(loc==left)  
                    flag =1;  
                else if(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
            }  
        }  
        return loc ;  
    }  // end of partition
    static void quickSort(int a[], int beg, int end)  
    {  

        int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }  
    }  // end of quicksort
}  // end of class