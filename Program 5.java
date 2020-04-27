import java.util.*;
public class Main{
static int delete(int arr[],int x,int n)
{
    int i;
   for(i=0;i<n;i++){
  if (arr[i] == x)
    break;
}
if(i==n)
  return (n);
if(i<n){
  for(int j=i;j<n-1;j++)
    arr[j] = arr[j+1];
  return (n-1);
  } 
  //arr[n-1]=0;  We cannot intialize here becz the compiler will not reach here as it will take the previous return statement
  return (n-1); // return anything in place of '(n-1)' as the compiler will not reach here
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = sc.nextInt();
int i;
int arr[] = new int[n];
System.out.println("Enter the Array");
for(i=0;i<n;i++)
  arr[i] = sc.nextInt();
System.out.println("The Array is" + Arrays.toString(arr));
System.out.println("Enter the element which is to be deleted");
int x = sc.nextInt();
int result = delete(arr,x,n);
arr[n-1]=0;//Initializing the last element as zero
System.out.println("The new Aray length is "+result);
System.out.println("The New Array is " + Arrays.toString(arr)); // This prints the whole array NOT PROPER
for(i=0;i<n-1;i++)
    System.out.print(arr[i]+" ");  // his prints the array remaining PROPER

 }
}
