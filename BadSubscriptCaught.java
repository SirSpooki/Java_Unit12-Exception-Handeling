import java.util.Arrays;
import java.util.Scanner;
public class BadSubscriptCaught {

public static void main(String[] args)
{
String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
"Fred", "Gina", "Henry"};
Scanner keyboard = new Scanner(System.in);
int number;
System.out.println("Enter index position: ");
number=keyboard.nextInt();

try{
System.out.println("Name is: "+names[number]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Subscript out of range");
}
}
}
