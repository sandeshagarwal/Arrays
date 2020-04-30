import java.util.*;
public class Main{
public static void main(String args[]){
int arr[] = {1,4,2,7,6,5};
System.out.println("The Initial Array is "+Arrays.toString(arr));
int n = arr.length;
int x = arr[0];
for(int i=0;i<n-1;i++) // When we run the loop till n and when we execute the below statement then we will get "arr[n-1] = arr[n]"
{                      // and that statement will cause error as array indexes are from 0 to n-1 and When we run the loop till n-1
  arr[i] = arr[i+1];  // then we will get "arr[n-2] = arr[n-1]" which will not cause any error as array indexes are proper
}
arr[n-1] = x;
System.out.println("The new Array is "+Arrays.toString(arr));
}
}
