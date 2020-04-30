import java.util.*;
public class Main{
public static void main(String args[])
{
int arr[] = {77,10,4,5,1,10,9,8,7};
//int arr[] = {7,10,4,10,6,5,2};
System.out.println("The array is "+Arrays.toString(arr));
int n = arr.length;
int temp[] = new int[n];// New array to store the Leader elements 
int x =1;
temp[0] = arr[n-1];//As the last element is always a Leader element
for(int i=n-2;i>=0;i--)//as temp[0] is already assigned and we checking from the last element as it takes a single for loop 
{
  if(arr[i] > temp[x-1]){// temp[x-1] =temp[1-1]ie.temp[0]
  temp[x] = arr[i];//temp[1]= arr[i]
  //System.out.println(arr[i]+" "+temp[x-1]);
  x++;
 }
}
System.out.println("The Leaders are ");
 for(int i=x-1;i>=0;i--){// We are comparing from right to left but we want the leader elements from Left to Right 
 System.out.print(temp[i]+" ");
 }
}
}
  
