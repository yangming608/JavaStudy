/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
/*反射是为了解决在运行期，对某个实例一无所知的情况下，如何调用其方法*/
public class ReflectionStudy {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(String.class);

        /*Class类的构造方法是private，只有JVM能创建Class实例，我们自己的Java程序是无法创建Class实例的*/
        String s = "Hello";
        Class cls = s.getClass();

        Class cls2 = Class.forName("java.lang.String");         /*Class实例在JVM中是唯一的，所以，上述方法获取的Class实例是同一个实例。可以用==比较两个Class实例*/

        System.out.println(cls == cls2);
    }
}

