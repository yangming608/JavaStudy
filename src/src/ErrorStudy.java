package src;
/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明:
 *
 * @author yangming28071
 */

/*从继承关系可知：Throwable是异常体系的根，它继承自Object。Throwable有两个体系：Error和Exception，Error表示严重的错误，程序对此一般无能为力，例如：
    OutOfMemoryError：内存耗尽
    NoClassDefFoundError：无法加载某个Class
    StackOverflowError：栈溢出
而Exception则是运行时的错误，它可以被捕获并处理。某些异常是应用程序逻辑处理的一部分，应该捕获并处理。例如：
    NumberFormatException：数值类型的格式错误
    FileNotFoundException：未找到文件
    SocketException：读取网络失败
还有一些异常是程序逻辑编写不对造成的，应该修复程序本身。例如：
    NullPointerException：对某个null的对象调用方法或字段
    IndexOutOfBoundsException：数组索引越界
Exception又分为两大类：
    RuntimeException以及它的子类；
    非RuntimeException（包括IOException、ReflectiveOperationException等等）
Java规定：
    必须捕获的异常，包括Exception及其子类，但不包括RuntimeException及其子类，这种类型的异常称为Checked Exception。
    不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。*/

/*使用try ... catch ... finally时：
多个catch语句的匹配顺序非常重要，子类必须放在前面；
finally语句保证了有无异常都会执行，它是可选的；
一个catch语句也可以匹配多个非继承关系的异常。*/

/*调用printStackTrace()可以打印异常的传播栈，对于调试非常有用；
捕获异常并再次抛出新的异常时，应该持有原始异常信息；
通常不要在finally中抛出异常。如果在finally中抛出异常，应该原始异常加入到原有异常中。调用方可通过Throwable.getSuppressed()获取所有添加的Suppressed Exception。*/
public class ErrorStudy {
    public static void main(String[] args){
        try {
            boolean rrr = f1(5, 0);
            System.out.println(rrr + "结果");
        }catch (Exception e){

        }
    }

    static boolean f1(int a, int b){
        boolean res = false;
        try {
            if (a/b > 0){
                res = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
}

