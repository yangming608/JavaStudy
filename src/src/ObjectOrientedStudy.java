package src;/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class ObjectOrientedStudy {
    public static void main(String[] args){
        Person ming = new Person();
        ming.setName("xiaoMing");

        Person hong = new Person("xiaoHong", 28);
//        System.out.println(hong.getName());

//        ming.printMsg();
//        ming.printMsg(ming.getName());

/*          多态的示例 引用变量为父类，与变量的实际类型不符合，在调用方法时，实际上调用的是变量类型本身的方法。
          多态Polymorphic的特性说明--Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型
          多态具有一个非常强大的功能，就是允许添加更多类型的子类实现功能扩展，却不需要修改基于父类的代码。*/
        Person p = new Student("xixi", 222, 100);
        p.printMsg();

/*
         所有的类继承自 Object，都含有 toString  equal hashCode方法，可以复写这些方法,下面分别是不复写和复写的情况
*/
        System.out.println(p.name);
        System.out.println("没有override toString  -------" + p.toString());
        System.out.println("已经override toString  -------" + p.toString());

        System.out.println(Person.class);
    }
}


class Person{
    String name;
    private int age = 15;               /* 这里的age是实例变量，没有加static的修饰就不是类变量*/

/*    在Java中，创建对象实例的时候，按照如下顺序进行初始化：
    先初始化字段，例如，int age = 15;表示字段初始化为10，double salary;表示字段默认初始化为0，String name;表示引用类型字段默认初始化为null；
    执行构造方法的代码进行初始化。
 构造方法是和类名一样的一个函数，没有返回值*/
     Person(String name, int age){
        this.name = name;
        this.age = age;
    }

     Person(){
    }

     private String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

/*
     方法重载的介绍 对应解决的问题是python中函数的默认参数  方法重载的返回值类型通常都是相同的。
*/
    public void printMsg(){
        System.out.println("这里是没有参数的printMsg函数");
    }

     void printMsg(String msg){
        System.out.println("这里是存在参数的printMsg函数");
        System.out.println(msg);
    }

    public final void finalPrint(){
        System.out.println("finalPrint");
    }
}

class Student extends Person {
    private int score;

/*      如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
        这里还顺带引出了另一个问题：即子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。*/
    Student(String name, int age, int score){
        super(name, age);
        this.score = score;
    }


    @Override
    public void printMsg(){
        super.printMsg();
        System.out.println("我重写了这个函数！！！");
    }

    @Override
    public String toString() {
        return "src.Student-Name----" + this.name;
    }

/*    final修饰符有多种作用：
    final修饰的方法可以阻止被覆写；
    final修饰的class可以阻止被继承；
    final修饰的field必须在创建对象时初始化，随后不可修改*/
//    @Override
//    public void finalPrint()
}

