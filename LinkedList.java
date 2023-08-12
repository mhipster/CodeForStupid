import java.util.Comparator;

public class LinkedList {
    private ListNode head; // ส่วนหัว

    // สร้างคุณสมบัติของข้อมูลและชี้ไปยัง node ถัดไป
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    // แสดงข้อมูลที่เก็บไว้ใน linkedlist
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.println(current.data + " --> "); // sout + enter = System.out.println
            current = current.next;
        }
        System.out.println("null");
    }
    // นับจำนวนข้อมูลที่อยู่ใน linkedlist
    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    // เพิ่มค่าเข้าไปใน node ใหม่
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedList sll = new LinkedList();
        /*sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null */
        sll.insertFirst(18);
        sll.insertFirst(8);
        sll.display();
        System.out.println("Length is " + sll.length());
    }
    public static void sort(int item, Comparator<Object> reverseOrder) {
    }
}