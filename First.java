public class leftshift {
public static void main(String[] args) {
for(int i=1;i<=100;i++)
{
if(i%4==0 && i%7==0)
{
int x=i;
System.out.println("x="+x+" "+"x<<2 = "+(x << 2));
}
}
}
}