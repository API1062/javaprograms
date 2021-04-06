import java.util.Scanner;
public class array {
public static void main(String[] args) {

int r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows");
r=sc.nextInt();
int c;
System.out.println("Enter the number of columns");
c=sc.nextInt();

int[][] a=new int[r][c]; //first matrix
System.out.println("Enter the elements of first matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
a[i][j]=sc.nextInt();
}
int[][] b=new int[r][c]; // second matrix
System.out.println("Enter the elements of second matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
b[i][j]=sc.nextInt();
}
System.out.println("Enter the elements of third matrix");
int[][] d=new int[r][c]; //third matrix
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
d[i][j]=sc.nextInt();
}
int[][] e=new int[r][c]; //first resultant matrix
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
e[i][j]=0;
for(int k=0;k<r;k++)
{
e[i][j]+=a[i][k]*b[k][j];
}
}
}
int[][] f=new int[r][c]; // second resultant matrix
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
f[i][j]=0;
for(int k=0;k<r;k++)
{
f[i][j]+=e[i][k]*d[k][j];
}
}
}
System.out.println("Resultant Matrix is");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
System.out.println(f[i][j]);
}
}