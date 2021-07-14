
//Lec01 Exerise02
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int width;
    int length;
    int primeter;

    Scanner my=new Scanner(System.in);

    System.out.println("Enter the Width : ");
    width=my.nextInt();
    System.out.println("Enter the Length : ");
    length=my.nextInt();
    primeter=2*(length+width);

    System.out.println("Perimeter is : "+primeter);
  }
}