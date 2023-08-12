public class Onpow2 {
    public static void main(String[] args) {
        // O(n^2)
        // quadratic
        // เช่น หาว่า array มีตัวซ้ำหรือไม่
        // เริ่มแย่ เพราะ ถ้าเพิ่มขนาด input ไปสัก 2 เท่า จะทำให้ประมวลผลเพิ่มขึ้น 4 เท่า
        // ex. int[] array = {1, 3, 6, 7, 9, 0, 3, 1, 3, 6, 7, 9, 0, 3}; 
        int[] array = {2, 3, 5}; // กำหนด arr
        int i = 0; 
        while(i < array.length){ // arr ต้องมากกว่า 0
            int j = i + 1;
            while(j < array.length){
                if(array[i] == array[j]){
                    System.out.println("พบตัวซ้ำคือ "+ array[i] + " ใน index ที่ " + i + " และ " + array[j] + " ใน index ที่ " + j);
                    break;
                }
                j++;
            }
            if (j < array.length) {
                break; // หยุดลูปทันทีเมื่อพบตัวซ้ำ
            }
            i++;
        }
        if (i == array.length) {
            System.out.println("ไม่พบตัวซ้ำ");
        }
    }
}