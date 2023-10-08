import java.util.Scanner;
class ATM{
public static void main(String[] args){
int balance=100000;
try(Scanner sc=new Scanner(System.in)){
while(true){
System.out.println("Welcome to ATM");
System.out.println("choose 1 to withdraw");
System.out.println("choose 2 to deposit");
System.out.println("choose 3 to check balance");
System.out.println("choose 4 to exit");
System.out.println("please enter your choose :");
int a=sc.nextInt();
switch(a){
case 1:System.out.println("enter amount to withdraw");
int withdraw=sc.nextInt();
if(withdraw<balance){
balance=balance-withdraw;
System.out.println("The amount have been withdrawed is :"+withdraw+" and your balance is:"+balance);
break;}else{
System.out.println("sorry can't withdraw because your balance is insufficent");
break;
}
case 2:System.out.println("enter amount to deposit");
int deposit=sc.nextInt();
balance=deposit+balance;
System.out.println("The amount have been deposited is :"+ deposit +" and your balance is:"+balance);
break;
case 3:System.out.println("your balance is:"+balance);break;
case 4:System.out.println("Thank you");break;
}}}}}