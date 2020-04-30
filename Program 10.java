import java.util.*;
public class Main{
public static void main(String args[]){
int arr[] = {77,10,4,5,1,10,9,8,7};
int n = arr.length;
System.out.println("The Leaders are ");
boolean flag; //= false; // We can't define the flag here as it will have to be changed to flase when code goes into the if condition
for(int i=0;i<n;i++)  // and it sets the flag as true and we have to make it false again
{
  flag = false;
   //System.out.println(flag); 
  for(int j=i+1;j<n;j++)
  {
    if(arr[i] <= arr[j]) // we have to check the equalto(=) condition also otherwise it will print two 10's(ie 10,10)
    {                    // if arr[i] is less than or equal to arr[j] then it not a leader
      flag = true;
      break;
    }
  }
  if(flag == false)
  {
    System.out.print(arr[i]+" ");
  }
}
}
}
  
