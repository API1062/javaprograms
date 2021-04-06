import java.util.Scanner;
public class CheckTwoStrings {
static int MAX = 256;
static boolean check(String str1, String str2)
{
// Create a count array and count frequencies
// characters in str1.
int[] count = new int[MAX];
char []str3 = str1.toCharArray();
for (int i = 0; i < str3.length; i++)
count[str3[i]]++;
char []str4 = str2.toCharArray();
for (int i = 0; i < str4.length; i++) {
if (count[str4[i]] == 0)
return false;
count[str4[i]]--;
}
return true;
}
public static void main(String[] args) {
String str1, str2;
System.out.println("Enter first string");
Scanner sc=new Scanner(System.in);
str1=sc.nextLine();

System.out.println("Enter second string");
str2=sc.nextLine();
if (check(str1, str2))
System.out.println("Yes");
else
System.out.println("No");
}
}