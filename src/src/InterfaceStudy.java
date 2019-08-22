package src;
/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明: 接口学习
 *
 * @author yangming28071
 */
public class InterfaceStudy {
    public static void main(String[] args) {

/*
        在使用的时候，实例化的对象永远只能是某个具体的子类，但总是通过接口去引用它，因为接口比抽象类更抽象
*/
        Animal d1 = new Dog("dog1");

        d1.run();

        d1.eat();

        System.out.println(d1.sleepTime("123"));
    }

}

/* interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）
 在Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface
 一个interface可以继承自另一个interface。interface继承自interface使用extends，它相当于扩展了接口的方法。
 合理设计interface和abstract class的继承关系，可以充分复用代码。一般来说，公共逻辑适合放在abstract class中，具体逻辑放到各个子类，而接口层次代表抽象程度。*/

/*实现类可以不必覆写default方法。default方法可以编写一些函数实现，其目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段[（JDK>=1.8）才可以定义default方法]*/

/*因为interface是一个纯抽象类，所以它不能定义实例字段。但是，interface是可以有静态字段的，并且静态字段必须为final类型
        实际上，因为interface的字段只能是public static final类型，所以我们可以把这些修饰符都去掉*/
interface Animal {
    int MALE = 1;
    int FEMALE = 0;

    void run();
    void eat();
    int sleepTime(String ss);
}



class Dog implements Animal {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running");
        System.out.println(MALE + FEMALE);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
    }

    @Override
    public int sleepTime(String ss) {
        return ss.length();
    }
}



