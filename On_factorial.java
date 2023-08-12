public class On_factorial {
    // O(n!)
    // แย่ที่สุดที่จะเขียนได้แล้ว เพราะคอมพิวเตอร์ต้องใช้เวลาประมวลผลนานมากๆ มีลูปซ้อนเยอะๆ รันนานๆ
    // Factorial                                                                                                                                  
    public static void facRuntime(int n){
        for(int i = 0;i < n; i++){
            System.out.println("Calling facRuntime(" + (n - 1) + ")");
            facRuntime(n - 1);
        }
    } 
    public static void main(String[] args) {
        int n = 3;
        facRuntime(n);
    }
}