import java.util.*;
public class Main{
  public static void main(String args[])
  {
    int arr[] = {20,5,6,7,25,1};
    int n = arr.length;
    System.out.println("Enter the element to be searched");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int flag = 0;
    
    for(int i=0;i<n;i++)
    {
      if(arr[i] == x)
        flag = 1;
      else 
        flag = 0;
    
    }
    //System.out.println(flag);
    if(flag == 1)
      System.out.println("element found");
    else 
        System.out.println("Not found");
      
     
      }
}
