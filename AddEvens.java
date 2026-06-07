import java.util.Scanner;
class AddEvens
{
 public static void main(String[] args)
 {
 Scanner keyboard = new Scanner(System.in);
 System.out.print("Enter number:");
 int num = keyboard.nextInt();
 int sum = 0;
 for(int i = 1; i <= num; i++)
 {
 if(i % 2 == 0)
 {
 sum += i;
 }
 System.out.println(i + " " + num + " " + sum);
 }
 System.out.println("Sum of evens is " + sum);
 }}