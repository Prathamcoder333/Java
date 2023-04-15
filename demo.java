import java.util.Scanner;
class Calculator{
    public int add(int n1,int n2){
        int r = n1+n2;
        return r;
    }
}
public class demo {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter x and y: ");
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        Calculator calc = new Calculator();
        int result = calc.add(x, y);
        System.out.println(result);

        myObj.close();
    }
}   