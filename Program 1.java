import java.util.*;
 class M{
  int search(int arr[],int x,int n){
     int i;
    for( i=0;i<n;i++)
    {
      if(arr[i] == x)
      {
        return i;
      }
      
    }
    //System.out.print("hii"); I want to ask why the code is not coming here at return -1 when there is a no. present in the array
    //return -1 is outside for loop and not in else condition then why the control is not coming here when there is a no. present in the array
   // It does not comes here becuse it will not exceute the statements after it will find the first return(ie.return control to the method where it is called)
   // If we are using else statement after if, and it contains return -1, It will print -1 because 
   //if you do not query the first no. in the array then if statement is false and will go else condition and return -1 from there and 
   //then do not goes to any reurn statement after that.
   return -1;
  }
 }
  public class Main{
  public static void main(String args[])
  {
    int arr[] = {20,5,6,7,25,1};
    int n = arr.length;
    System.out.println("Enter the element to be searched");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    M obj1 = new M();
    int y = obj1.search(arr,x,n);
    if(y == -1) 
        System.out.print("Element is not present in array"); 
    else
        System.out.print("Element is present at index " + y); 
  
      }
}
