import java.util.Scanner;

public class On2 {
    public static void main(String[] args) {
        // ระดับดี ขึ้นกับจำนวน input ที่ใส่เข้ามา
        // Linear
        // เช่น การ Loop 1 ชั้น
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = kb.nextInt();
        for(int i = 1; i <= number ; i++){
            System.out.println(i);
        }
    }
}