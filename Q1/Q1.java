import java.util.Scanner;

public class Q1{
public static void main(String[] args){

Scanner input=new Scanner(System.in);

System.out.print("Enter the first integer: ");
int numberOne=input.nextInt();

System.out.print("Enter the second integer: ");
int numberTwo=input.nextInt();

System.out.print("Enter the third integer: ");
int numberThree=input.nextInt();

System.out.println();
System.out.print("User enter numbers are:" + numberOne + " " + numberTwo + " " + numberThree );

int smallest=numberOne;
int largest=numberOne;

if(numberTwo<smallest){
    smallest=numberTwo;
}
if(numberTwo>largest){
    largest=numberTwo;
}
if(numberThree<smallest){
    smallest=numberThree;
}
if(numberThree>largest){
    largest=numberThree;
}
System.out.println();
System.out.println("Smallest is: "+smallest);
 
System.out.println("Largest is: "+largest);

}
}