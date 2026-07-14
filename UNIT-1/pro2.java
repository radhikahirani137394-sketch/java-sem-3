//prog-2 get a name from user and display on screen

import java.util.Scanner;
public class pro2{
  public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter your name:");
 String name= sc.nextLine();
 System.out.println("your name is:"+name);
sc.close();
}
}
 