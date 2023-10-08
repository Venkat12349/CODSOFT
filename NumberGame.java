import java.util.Scanner;
class NumberGame{
public static void main(String[] args)
{
int min=1,max=100;
int a=(int)(Math.random()*(max-min))+min;
System.out.println("Enter the number u have been guessed");
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int limit=3;
int count=0;
while(count<limit){
if(a==b){
System.out.println("Congratulations you guess is too high your score is:"+(limit-count)+"/"+limit+" your score is: "+count+1);
}else{
System.out.println("please try again");
System.out.println("Enter the number u have been guessed");
b=sc.nextInt();
count++;
}
if(count==limit){
System.out.println("Congratulations you guess is too low your score is:"+ 0 +"/"+ 3 +" your score is: "+ 0);
System.out.println("if want to continue then click y else n: ");
String c=sc.next();
if(c.equals("y")){
count=0;
}else{
break;
}}
}
}}