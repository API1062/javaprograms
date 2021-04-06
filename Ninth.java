package firstpackage;
import java.util.*;
public class Exception {
public static void main(String[] args) {
ArrayList<Integer> a=new ArrayList<Integer>();
System.out.println("Enter the size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++)
{
int x=sc.nextInt();
a.add(x);
}
System.out.println("Enter the indices you want to swap");
int i1=sc.nextInt();
int i2=sc.nextInt();
try
{
Collections.swap(a, i1, i2);
System.out.println(a);
}
catch(IndexOutOfBoundsException e)
{
System.out.println("Please Enter Valid Index");
}
}
}