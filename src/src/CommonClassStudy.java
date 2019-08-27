/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class CommonClassStudy {
    public static void main(String[] args) {
        /* Math类的学习 */

        /* 取最大最小值*/
        System.out.println(Math.max(15, 10));

        /*计算次方*/
        System.out.println(Math.pow(2, 3));

        /*计算开根号*/
        System.out.println(Math.sqrt(2));

        /*计算e的x次方：*/
        System.out.println(Math.exp(2));

        /*数学常量 PI和E*/
        System.out.println(Math.PI);
        System.out.println(Math.E);

        /*生成0到1的随机数*/
        System.out.println(Math.random());

        /*我们想要的是一个不可预测的安全的随机数，SecureRandom就是用来创建安全的随机数的
        SecureRandom的安全性是通过操作系统提供的安全的随机种子来生成随机数。这个种子是通过CPU的热噪声、读写磁盘的字节、网络流量等各种随机事件产生的“熵”。*/
    }

}

