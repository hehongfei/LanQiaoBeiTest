package C语言网;

import java.util.Scanner;

/**
 * 题目描述
 * 输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。
 * <p>
 * 输入
 * 输入数据有多组，
 * 每组占一行，
 * 每行的第一个数字为n,
 * 接着是n个整数，
 * n=0表示输入数据的结束，不做处理。
 * <p>
 * 输出
 * 对于每个测试实例，输出排序后的结果，两个数之间用一个空格隔开。每个测试实例占一行
 * <p>
 * 样例输入
 * 3 3 -4 2
 * 4 0 1 2 -3
 * 0
 * 样例输出
 * -4 3 2
 * -3 2 1 0
 *
 * @author hongfei He
 */
public class C_1169_绝对值排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc . nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int ans : arr) {
                System.out.print(ans + " ");
            }
//            System.out.println();
        }
    }
}
