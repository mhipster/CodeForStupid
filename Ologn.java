public class Ologn {
    public static void main(String[] args) {
        // ความเร็วในระดับเยี่ยมยอด
        // loop แต่ละรอบจะลดการทำงานที่ไม่มีโอกาสเกิดขึ้นแน่ๆไปทีละครึ่ง
        // logarithmic
        // เช่น Binary Search
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // สร้าง Array ที่จะ Search หา
        int target = 10; // กำหนดเลขที่จะค้นหา

        int left = 0; // กำหนดให้หาจาก index แรก คือตำแหน่งที่ 0
        int right = array.length-1; // index สูงสุดของการค้นหาคือตำแหน่งสุดท้ายไล่กลับมาที่เริ่มต้น
        int result = -1; 
        // ใช้ระบุว่ายังไม่พบเป้าหมาย เพราะค่า -1 ซึ่งเป็นค่าที่ไม่สามารถเป็น index ของอาร์เรย์ได้ (เนื่องจากดัชนีของอาร์เรย์ต้องเป็นจำนวนไม่ติดลบ)
        while(left <= right){ // index ใน array ต้องไม่น้อยกว่า 0
            int mid = left + (right - left) / 2; 
            //ช่วยลดการค้นหาลง จาก array คือ mid = 0 + (10 - 0) / 2 = 5 ; 10 คือ length
            if(array[mid] == target){ // ถ้า array ตำแหน่งกลาง = target 10 
                result = target; //แล้ว result จะเป็นตำแหน่งนั้น
                break;
            }else if(array[mid] < target){ // ถ้า array นั้นมีตำแหน่งที่น้อยกว่าเป้าหมาย 
                left = mid + 1; //ให้ค้นหาตำแหน่งด้านขวาต่อ
            }
            else{ // ถ้า array มากกว่าทางขวาให้กลับมาทางด้านซ้าย คือ -1
                right = mid - 1;
            }
        }
        if(result != -1){ // ถ้าพบตำแหน่งที่ต้องการ
            System.out.println("ค่า " + target + " พบที่ตำแหน่ง " + result);
        }
        else {
            System.out.println("ไม่พบค่า " + target + " ใน array");
        }
    }
}