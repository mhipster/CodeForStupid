// Manitchaya Thamanunpongsa sec3
import java.util.Scanner;

public class ExpressionTest {
    static String S[] = new String[10];
    static int Top = -1;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s;
        String con = "y";
        System.out.println(">>> Expression Test Program <<<");
        while (con.equals("y")) {
            String ans = "true";
            System.out.print("Input expression : ");
            s = kb.nextLine();
            String op[] = s.split("");
            for (int i = 0; i < op.length; i++) {
                if (op[i].equals("(") || op[i].equals("{") || op[i].equals("[")) {
                    push(op[i]);
                } else if (op[i].equals(")")) {
                    if (!pop().equals("(")) {
                        ans = "false";
                        break;
                    }
                } else if (op[i].equals("}")) {
                    if (!pop().equals("{")) {
                        ans = "false";
                        break;
                    }
                } else if (op[i].equals("]")) {
                    if (!pop().equals("[")) {
                        ans = "false";
                        break;
                    }
                }
            }
            if (Top != -1) {
                ans = "false";
                Top = -1;
            }

            System.out.println("The result : " + ans);
            System.out.print("Continue (y|n) : ");
            con = kb.nextLine();
        }
        System.out.println("Thank you....");
    }

    static void push(String item) {
        if (Top < S.length - 1) {
            Top++;
            S[Top] = item;
        }
    }
    static String pop() {
        String item = "";
        if (Top != -1) {
            item = S[Top];
            Top--;
        }
        return item;
    }
}
