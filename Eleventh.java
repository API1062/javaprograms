package firstpackage;
import java.util.*;
public class hashmap {
public static void main(String[] args) {
HashMap<Integer,String> h=new HashMap<Integer,String>();
h.put(5,"Kerala");
h.put(3,"Tamil Nadu");
h.put(4,"Karnataka");
h.put(1,"Maharashtra");
h.put(2,"Telangana");
System.out.println("Intial Map: "+h);
List<Integer> l
= new ArrayList<Integer>(h.keySet());
Collections.reverse(l);
System.out.println("Reverse Order: ");
for (Integer strKey : l) {
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "

+ h.get(strKey));
}
Collections.reverse(l);
System.out.println("Key <= 3");
for (Integer strKey : l) {
if(strKey<=3)
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
}
System.out.println("Not Containing key 2 and 3");
for (Integer strKey : l) {
if(strKey!=2 || strKey!=3)
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
}
System.out.println("Key > 3");
for (Integer strKey : l) {
if(strKey>3)
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
}
System.out.println("Key<= 3");
for (Integer strKey : l) {
if(strKey<=3)
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
}
int flag=-1;
System.out.println("Key value<=Maharashtra ");
for (Integer strKey : l) {
if(h.get(strKey)=="Maharashtra")
{
flag=0;
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
break;
}
if(flag==-1)
System.out.println("Key : " + strKey + "\t\t"

+ "Value : "
+ h.get(strKey));
}
flag=-1;
System.out.println("Key value>Karnataka ");
for (Integer strKey : l) {
if(flag==0)
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
if(h.get(strKey)=="Karnataka")
{
flag=0;
}
}
System.out.println("Key value!=Kerala && Telangana ");
for (Integer strKey : l) {
if(h.get(strKey)!="Kerala" && h.get(strKey)!="Telangana")
System.out.println("Key : " + strKey + "\t\t"
+ "Value : "
+ h.get(strKey));
}
}
}