package assignments;
public class inheritance {
interface A
{
public void sum(int a,int b);
public void sub(int a,int b);
public void mult(int a,int b);
public void modulus(int a,int b);
public void div(int a,int b);
public void increment(int a);
public void decrement(int a);
}
interface B
{
public void or(int a,int b);
public void and(int a,int b);
public void xor(int a,int b);
public void complement(int a);
public void leftshift(int a);
public void rightshift(int a);
}
static class C implements A,B
{
public void sum(int a,int b)
{
int c=a+b;
System.out.println("Sum of "+a+" and "+b+" is "+c);

}
public void sub(int a,int b)
{
int c=a-b;
System.out.println("Difference of "+a+" and "+b+" is

"+c);
}
public void mult(int a,int b)
{
int c=a*b;
System.out.println("Product of "+a+" and "+b+" is

"+c);
}
public void div(int a,int b)
{
float c=a/b;
System.out.println("Division of "+a+" and "+b+" is

"+c);
}
public void modulus(int a,int b)
{
int c =a%b;
System.out.println("Modulus of "+a+" and "+b+" is

"+c);
}
public void increment(int a)
{
int c=a++;
System.out.println("Increment of "+ a + " is "+c);
}
public void decrement(int a)
{
int c=a--;
System.out.println("Decrement of " +a+ " is "+c);
}
public void or(int a,int b)
{
int c=a|b;
System.out.println("OR of "+a+" and "+b+" is "+c);
}
public void and(int a,int b)
{
int c=a&b;
System.out.println("AND of "+a+" and "+b+" is "+c);
}
public void xor(int a,int b)
{
int c=a^b;
System.out.println("XOR of "+a+" and "+b+" is "+c);
}
public void complement(int a)

{
int c=~a;
System.out.println("Complement of "+a+" is "+c);
}
public void leftshift(int a)
{
System.out.println("Left Shift: "+a+"<<2 is

"+(a<<2));
}
public void rightshift(int a)
{
System.out.println("Right Shift: "+a+">>2 is

"+(a>>2));
}
}
public static void main(String[] args) {
C obj=new C();
obj.sum(10,15);
obj.sub(234,123);
obj.mult(34,12);
obj.div(24,12);
obj.modulus(100, 9);
obj.increment(1);
obj.decrement(123);
obj.or(2345,543);
obj.and(234,23);
obj.xor(34,123);
obj.complement(23);
obj.leftshift(50);
obj.rightshift(40);
}
}