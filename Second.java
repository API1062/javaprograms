package firstpackage;
public class andoperator {
public static void main(String[] args) {
int i=0,j=1;
while(i<=100 && j<=101)
{
int x=i&j;
System.out.println(i+"&"+j+": "+x);
i+=2;
j+=2;
}
}
}