package assignments;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class hashmap {
public static void main(String[] args) {
HashMap<Integer,String> h=new HashMap<Integer,String>();
h.put(1, "A");
h.put(2, "BCD");
h.put(3, "EF");
h.put(4, "GH");
h.put(5, "IJKL");
int x=0;
int[] a=new int[5];
int i=0;
for(Map.Entry mapElement: h.entrySet())
{
x=x+(int)mapElement.getKey();
int count=0;
String s=(String)mapElement.getValue();
while(count!=s.length())
{
count++;
}
a[i]=count;
i++;
}
System.out.println("Sum Of Key Values Is "+x);
for(int j=0;j<5;j++)

{
System.out.println("No. of characters at index value
"+j+" is "+a[j]);
}
}
}