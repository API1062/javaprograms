package assignments;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class arraylist {
public static void main(String[] args) {
ArrayList<String> a=new ArrayList<String>();
System.out.println("Enter the size of ArrayList");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Enter value : ");
Scanner s=new Scanner(System.in);
String str;
str=s.nextLine();
a.add(str);
}
Iterator it=a.iterator();
int[] x=new int[n];
int i=0;
while(it.hasNext())
{
String s=(String) it.next();
int count=0;
while(count<s.length())
{
count++;
}
x[i]=count;
i++;
}
for(int j=0;j<n;j++)
{
System.out.println("No. of characters at index "+j+" = "+x[j]);
}
}
}