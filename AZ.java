import java.util.*;
class AZ
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=6;
System.out.println("Enter the string");
String s=sc.nextLine();
s=s.toUpperCase();

for(int g=0;g<s.length();g++){
char base=s.charAt(g);

switch(base){
case 65:
//A
for(int i=1;i<=n;i++)
{
for(int k=1;k<=n-i;k++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
if(j==1||j==i||i==(n/2)+1)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println( );
}
System.out.println();
break;

case 66:
//B
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if((i==1||i==n-1||i==n/2)&&j<(n-2))
{
System.out.print("*");
}
else if(j==(n-2)&&!(i==1||i==n-1||i==n/2))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 67:
//C
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j>=1 &&i==1 || i>1&&j==1 ||i==n&&j>1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 68:

//D
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||i==1&&j<=n-1||j==n||i==n &&j<=n-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println( );
}
System.out.println();

break;



case 69:
//E
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||j==1||i==n||i==(n/2)+1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 70:
//F
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||j==1|| i==(n/2)+1&& j<n-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 71:
//G
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||j==1||i==n||j==n&& i>n/2||i==n/2&&j>n/2)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 72:
//H
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==n||i==(n/2)+1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println( );
}
System.out.println();
break;



case 73:

//I
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||i==n||j==(n/2)+1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 74:
//J
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1|| j==(n-2)||j<=(n/2)+1&&i==n||i==(n-1)&&j==1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 75:
//K
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||i>=(n/2)+1&& j==i||i<=n/2&&j==(n-i))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 76:
//L
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1 || i==n)
{
System.out.print("*");
}
}
System.out.println();
}
System.out.println();
break;



case 77:
//M
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==n||j==i&&i<=n/2 ||j==n-i&&i<=n/2)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 78:
//N
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==n||j==i)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 79:
//O
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1 || j==1||i==n||j==n)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();


break;



case 80:
//p
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==n/2 && i<=n/2||i==n/2&& j<=n/2||i==1&&j<=n/2)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
System.out.println();

break;



case 81:
//Q
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1 || j==1&&i<=n-1||i==n-1||j==n||i>n/2&&j==i)
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 82:

//R
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==n/2 && i<=n/2||i==n/2&& j<=n/2||i==1&&j<=n/2||i>=n/2&&j==n-j)
{
System.out.print("*");
}
else if(i==2&&i>=n/2)
{
System.out.println("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
System.out.println();
break;



case 83:
//S
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j>i&&i==1||j==i&&i>1||i==n&&j>1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 84:
//T
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1 ||j==n-(n/2))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

break;



case 85:
//U
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1 ||i==n||j==n)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 86:
//v
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==i&&j<=n/2||j==n/2&&i==n/2||j==n-i&&i<=n/2)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();



break;



case 87:

//W
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==n||i>n/2&&j==i||i>=(n/2)&&j==(n-i)+1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();


break;



case 88:
//X
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==j||j==(n-i)||j==1&&i==n)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();


break;



case 89:
//Y
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==i&&j<=n/2||j==n/2&&i==n/2||j==n-i)
//j==i&&j<=n/2||j==n/2&&i==n/2||j==n-i
//j==i && i<=n/2 ||j==n/2&&i>=n/2||j==n-i&& i<=n/2
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();
break;



case 90:

//Z
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||i==n||j==(n-i)||j==n&&i==1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;
}
}
}
}

