import java.util.Scanner;
class GradeCalculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of subjects: ");
int a=sc.nextInt();
int total=0;
for(int i=1;i<=a;i++){
System.out.println("enter the your subject mark "+i+" : ");
int marks=sc.nextInt();
total=total+marks;
}
int n=total/a;
if(n>=90 && n<=100){System.out.println("total marks: "+total+ " average percentage: "+n+" grade: A");}
else if(n>=80 && n<=90){System.out.println("total marks: "+total+ " average percentage: "+n+" grade B");}
else if(n>=70 && n<=80){System.out.println("total marks: "+total+ " average percentage: "+n+ "grade C");}
else if (n>=60 && n<=70){System.out.println("total marks: "+total+ " average percentage: "+n+ "grade D");}
else if(n>=50 && n<=60){System.out.println("total marks: "+total+ " average percentage: "+n+ "grade E");}
else if(n>=40 && n<=50){System.out.println("total marks: "+total+ " average percentage: "+n+ "grade F");}
else{System.out.println("total marks: "+total+ " average percentage: "+n+ "fail");}
}}