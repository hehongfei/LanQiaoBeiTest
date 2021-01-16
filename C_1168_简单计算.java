package C语言网;

import java.util.Scanner;

/**
 * 题目描述
 * 有一个n+2个元素a[0], a[1], ..., a[n+1] (n <= 3000, -1000 <= a[i] <=1000)构成的数列.
 * 已知对i=1, 2, ..., n有a[i] = (a[i-1] + a[i+1])/2 - c[i].
 * <p>
 * 给定a0, a[n+1], c[1], ... , c[n]. 写一个程序计算a[1].
 * <p>
 * 输入
 * 第一行是整数n. 接下来两行是a[0]和a[n+1], 其小数点后有两位数字. 其后的n行为c[i](同样是两位小数), 每行一个数.
 * <p>
 * 输出
 * 输出为a[1], 格式与a[0], a[n+1]相同.
 * <p>
 * 样例输入
 * 1
 * 50.50
 * 25.50
 * 10.15
 * 样例输出
 * 27.85
 *
 * @author hongfei He
 */

/**
 * 思路：
 *    2 * a[1] = a[0] + a[2] - 2 * c[1]
 *    2 * a[2] = a[1] + a[3] - 2 * c[2]
 *         .......
 *    2 * a[n-1] = a[n-2] + a[n] - 2 * c[n-1]
 *    2 * a[n] = a[n-1] + a[n+1] - 2 * c[n]
 *   左边所有项相加等于右边所有项相加, 消除后即可得到：a[1] + a[n] = a[0] + a[n+1] - 2*sum(c{1..n})
 *      a[n] = a[0] + a[n+1] - 2*sum(c{1..n}) - a[1]
 * 同理： a[n-1] = a[0] + a[n] - 2*sum(c{1..n-1}) - a[1]
 *         .......
 *     a[2] = a[0] + a[3] - 2*sum(c{1..2}) - a[1]
 *     a[1] = a[0] + a[2] - 2*sum(c{1..1}) - a[1]
 *   左边所有项相加等于右边所有项相加, 消除后即可得到最后的解：
 *   a[1] = (n * a[0] + a[n+1] - 2*(sum(c{1..1}) + sum(c{1..2}) + .... + sum(c{1..n})))/(n+1)
 */
public class C_1168_简单计算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double a0 = sc.nextDouble(), an_1 = sc.nextDouble();
            double[] c = new double[n + 1];
            for (int i = 1; i <= n; i++) {
                c[i] = sc.nextDouble();
            }
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    sum += c[j];
                }
            }
            System.out.printf("%.2f\n", (n * a0 + an_1 - 2 * sum) / (n + 1));
        }
        sc.close();
    }
}