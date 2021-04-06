public class constructor {
constructor(int id,int age,String name)
{
System.out.println("Inside Constructor With 3 Parameters");
System.out.print("id: "+id+",");
System.out.print(" age: "+age+",");
System.out.println(" name: "+name);
}
constructor(int id,int age)

{
System.out.println("Inside Constructor With 2 Parameters");
System.out.print("id: "+id+",");
System.out.print(" age: "+age);
}
public static void main(String[] args) {
constructor o1=new constructor(1,21,"ABC");
constructor o2=new constructor(1,21);
}
}