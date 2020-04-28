import java.util.*;
public class Main{
static int[] RemoveDuplicates(int arr[],int n){
int temp[] = new int [n];
temp[0] = arr[0];// The first element is always distinct as there is no element in temp array
int res = 1; //Length of the resultant Array(initially)
for(int i=1;i<n;i++)
{
  if(temp[res-1] != arr[i]){
    temp[res] = arr[i];
    res ++;}
 }
 System.out.println(Arrays.toString(temp)+"\t"+temp.length+"\t"+res);
 //return temp;// It will print the array till full length the last places which are not distinct will be zero(0)
 int temp1 [] = new int[res];// This is a new array created so that we do not print till full length(ie.7 in this case)
 for(int i=0;i<res;i++)
    temp1[i] = temp[i];
return temp1;
 }
public static void main(String args[]){
int arr [] = {1,2,2,4,5,5,5};//With Duplicates
//int arr[] = {1,2,3,4,5}; //Without Duplicates
System.out.println("The Array before removing Duplicates "+Arrays.toString(arr));
int n = arr.length;
arr = RemoveDuplicates(arr,n);
System.out.println("The Array after removing Duplicates "+Arrays.toString(arr));
int len = arr.length;
System.out.print("The Array after removing Duplicates is ");
for(int i=0;i<len;i++)
    System.out.print(arr[i]+" ");
}
}
