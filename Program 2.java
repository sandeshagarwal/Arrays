import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of elements");
int n = sc.nextInt();
int arr[] = new int [n];
System.out.println("Enter the elements in the Array");

for(int i = 0;i<n;i++){
  arr[i] = sc.nextInt();
  }
System.out.println("The elements in the Array are");
for(int i = 0;i<n;i++){  
  System.out.println(arr[i]);
}
  }
}
