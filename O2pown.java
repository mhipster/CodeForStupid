public class O2pown {
    public static void main(String[] args) {
        // แย่มากๆ เพราะ input แค่นิดเดียวก็ทำให้เวลาในการประมวลผลเพิ่มขึ้นอย่างมาก
        // exponential
        // เช่น การหาเลข Fibonacci ในลำดับที่ n --> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... และต่อไป
        int n = 3; // 0, 1, 2,.......
        int result = fib(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}