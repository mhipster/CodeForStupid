import java.util.Scanner;
import java.lang.String;

class O1 {
    public static void main(String[] args) {
        // เช่น หาเลขคู่ เลขคี่
        // Algorithm ที่ดีที่สุด 
        // Constant
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = kb.nextInt();

        String result = "";
        if(num % 2 == 0){
            result += "เลขคู่";
        }
        else {
            result += "เลขคี่";
        }
        System.out.println(result);
    }
}