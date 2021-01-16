package C语言网;

import java.util.Scanner;

/**
 * 题目描述
 * 一般来说一个比较安全的密码至少应该满足下面两个条件：
 * (1).密码长度大于等于8，且不要超过16。
 * (2).密码中的字符应该来自下面“字符类别”中四组中的至少三组。
 * 这四个字符类别分别为：
 * 1.大写字母：A,B,C...Z;
 * 2.小写字母：a,b,c...z;
 * 3.数字：0,1,2...9;
 * 4.特殊符号：~,!,@,#,$,%,^;
 * 给你一个密码，你的任务就是判断它是不是一个安全的密码。
 * <p>
 * 输入
 * 输入数据第一行包含一个数M，接下有M行，每行一个密码（长度最大可能为50），密码仅包括上面的四类字符。
 * <p>
 * 输出
 * 对于每个测试实例，判断这个密码是不是一个安全的密码，是的话输出YES，否则输出NO。
 * <p>
 * 样例输入
 * 3
 * a1b2c3d4
 * Linle@ACM
 * ^~^@^@!%
 * 样例输出
 * NO
 * YES
 * NO
 *
 * @author hongfei He
 */
public class C_1162_密码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        while (M > 0) {
            f(sc.next());
            M--;
        }
    }

    private static void f(String pwd) {
        if (pwd.length() < 8 && pwd.length() > 16) {
            System.out.println("NO");
            return;
        } else {
            int count = 0;
            if (pwd.matches(".*[A-Z]+.*")) {
                count++;
            }
            if (pwd.matches(".*[a-z]+.*")) {
                count++;
            }
            if (pwd.matches(".*[0-9]+.*")) {
                count++;
            }
            if (pwd.matches(".*[~!@#$%\\^]+.*")) {
                count++;
            }
            if (count < 3) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
