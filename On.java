import java.util.Scanner;

public class On {
    public static void main(String[] args) {
        // ระดับดี ขึ้นกับจำนวน input ที่ใส่เข้ามา
        // Linear
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = kb.nextInt();
        for(int i = 1; i <= number ; i++){
            System.out.println(i);
        }
    }
}
