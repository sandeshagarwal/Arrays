import java.util.*;
public class Main{  // we can't use 'int insert[]' as it will cause error we have to use only 'int [] insert'
static int [] insert(int arr[],int n,int x,int pos) // The '[]' is required int the method when returning an Array  
{                                                   // The return type of a method must be declared as an array of the correct data type
  int newarr []  = new int[n+1];
  for(int i=0;i<(n+1);i++)
  {
    if(i<pos-1)  // Inserting the values from 0 to the position where number is to be inserted
      newarr[i] = arr[i]; // new array getting the values of the old array
    else if(i == pos-1)  // Inserting the number at the postion in the new array
      newarr[i] = x;
    else
      newarr[i] = arr[i-1];// Inserting the remaining values from old array into the new array
   }
   return newarr;
 }
      
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements in the Array");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements in the Array");
for(int i=0;i<n;i++)
  arr[i] = sc.nextInt();
System.out.println("Enter the element to be Inserted in Array");
int x = sc.nextInt();
System.out.println("Enter the position where element is to be Inserted in Array");
int pos = sc.nextInt();
System.out.println("The Initial Array is");
System.out.println(Arrays.toString(arr));
arr = insert(arr,n,x,pos);  
System.out.println("The Final Array is");
System.out.println(Arrays.toString(arr));

}
}
