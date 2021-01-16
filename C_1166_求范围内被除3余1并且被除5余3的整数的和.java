package C语言网;

import java.util.Scanner;

/**
 * 题目描述
 * 输入两个正整数X,Y,求出[X,Y]内被除3余1并且被除5余3的整数的和
 * <p>
 * 输入
 * 输入两个正整数X,Y
 * <p>
 * 输出
 * 求所有满足条件的数的和
 * <p>
 * 样例输入
 * 200 800
 * 样例输出
 * 20020
 *
 * @author hongfei He
 */
public class C_1166_求范围内被除3余1并且被除5余3的整数的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        for (int start = X; start <= Y; start++) {
            if ((start % 3 == 1) && (start % 5 == 3)) {
                ans += start;
            }
        }
        System.out.println(ans);
    }
}
