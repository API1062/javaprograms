package firstpackage;
import java.util.*;
public class treeset {
public static void main(String[] args) {
TreeSet<Character> t=new TreeSet<Character>();
t.add('L');
t.add('M');
t.add('N');
t.add('O');
t.add('P');
t.add('Q');

System.out.println("Initial Set "+t);
System.out.println("Reversed Set "+t.descendingSet());
Set<Character> s=new HashSet<Character>();
for(Character value:t)
{
if(value<='O')
{
s.add(value);
}
}
System.out.println("Set Having Values<=O : "+s);
s.clear();
for(Character value:t)
{
if(value!='Q')
{
s.add(value);
}
}
System.out.println("Set Not Containing Q : "+s);
s.clear();
for(Character value:t)

{
if(value>'N')
{
s.add(value);
}
}
System.out.println("Set Containing Values>N : "+s);
s.clear();
for(Character value:t)
{
if(value!='L')
{
s.add(value);
}
}
System.out.println("Set Not Containing L : "+s);
}
}