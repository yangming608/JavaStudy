/*
 * 软件版权: 恒生电子股份有限公司
 */
package ming;

import src.HelloWorld;
/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class PackageStudy {
    public static void main(String[] args) {

/*        在Java中，我们使用package来解决名字冲突。
        Java定义了一种名字空间，称之为包：package。一个类总是属于某个包，类名（比如Person）只是一个简写，真正的完整类名是包名.类名。
        包没有父子关系。java.util和java.util.zip是不同的包，两者没有任何继承关系。*/

        /*位于同一个包的类，可以访问包作用域的字段和方法。不用public、protected、private修饰的字段和方法就是包作用域。*/

        /* Java内建的package机制是为了避免class命名冲突；
        JDK的核心类使用java.lang包，编译器会自动导入；
        JDK的其它常用类定义在java.util.*，java.math.*，java.text.*，……；
        包名推荐使用倒置的域名，例如org.apache*/

        /* 作用域 总结
        如果不确定是否需要public，就不声明为public，即尽可能少地暴露对外的字段和方法。
        把方法定义为package权限有助于测试，因为测试类和被测试类只要位于同一个package，测试代码就可以访问被测试类的package权限方法。
        一个.java文件只能包含一个public类，但可以包含多个非public类。如果有public类，文件名必须和public类的名字相同。

        Java内建的访问权限包括public、protected、private和package权限；
        Java在方法内部定义的变量是局部变量，局部变量的作用域从变量声明开始，到一个块结束；
        final修饰符不是访问权限，它可以修饰class、field和method；
        一个.java文件只能包含一个public类，但可以包含多个非public类。
         */

        System.out.println(Person.class);

        HelloWorld h1 = new HelloWorld();
        h1.test2();

    }
}

class Person{

}

