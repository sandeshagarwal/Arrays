import java.util.*;
public class Main{
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
arr[pos-1] = x; // The postion in array starts from zero
System.out.println("The Final Array is");
System.out.println(Arrays.toString(arr));

}
}
