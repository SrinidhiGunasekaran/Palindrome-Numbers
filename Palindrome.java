import java.io.*;
class Palindrome
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int number,n,rev=0,rem=0;
number=Integer.parseInt(in.readLine());
n=number;
while(n>0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(rev==number)
{
System.out.println("The number is palindrome");
}
else
{
System.out.println("The number is not palindrome");
}
}
catch(Exception e)
{
}
}
}
