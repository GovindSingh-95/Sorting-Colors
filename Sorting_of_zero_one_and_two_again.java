import java.util.*;
public class Sorting_of_zero_one_and_two_again{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Size of the array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your Array: ");
        for(int i=0;i<n;i++) arr[i]=Sc.nextInt();
        int low=0,mid=0,high=n-1;
        while(high>=mid){
            if(arr[mid]==0){
                int swap=arr[mid];
                arr[mid]=arr[low];
                arr[low]=swap;
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;
            else {
                int swap=arr[mid];
            arr[mid]=arr[high];
            arr[high]=swap;
            high--;
            }
        }
        System.out.print("Sorted Array is: ");
        for(int ele:arr) System.out.print(ele+" ");
    }
}
