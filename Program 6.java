import java.util.*;
public class Main{
static int[] reverse(int arr[]) //to return array we have to define teh method as 'int[] reverse'
{
  int start = 0;
  int end = (arr.length - 1); //Because array starts from 0 here for ex. arr.length = 7 but array will go from 0 to 6
  //System.out.println(end);  // otherwise we will ArrayOutBoundsException
  while(start < end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start ++;
    end --;
    }
 return (arr);
}
public static void main(String args[]){
int arr[] = {1,3,5,7,9,2,4}; //for odd array
//int arr[] = {1,3,5,7,9,8}; // for even array
System.out.println("The Initial Array is "+Arrays.toString(arr));
arr = reverse(arr);
System.out.println("The Reversed Array is "+Arrays.toString(arr));
}
}
