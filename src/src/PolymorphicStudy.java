package src;
/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明: 多态学习
 *
 * @author yangming28071
 */
public class PolymorphicStudy {
    public static void main(String... args){
        Income[] incomes = new Income[] {
                new SalaryIncome(5000),
                new OtherIncome(1000)
        };

        System.out.println(getTotalTax(incomes));
    }

    //  观察totalTax()方法：利用多态，totalTax()方法只需要和Income打交道，它完全不需要知道Salary和StateCouncilSpecialAllowance的存在，就可以正确计算出总的税。
    //  如果我们要新增一种稿费收入，只需要从Income派生，然后正确覆写getTax()方法就可以。把新的类型传入totalTax()，不需要修改任何代码。
    //  多态具有一个非常强大的功能，就是允许添加更多类型的子类实现功能扩展，却不需要修改基于父类的代码。
    private static double getTotalTax(Income... incomes){
        double totalTax = 0;
        for (Income income:incomes){
            totalTax += income.getTax();
        }
        return totalTax;
    }
}

//  通过abstract定义的方法是抽象方法，它只有定义，没有实现。抽象方法定义了子类必须实现的接口规范；
//  定义了抽象方法的class必须被定义为抽象类，从抽象类继承的子类必须实现抽象方法；
//  如果不实现抽象方法，则该子类仍是一个抽象类；面向抽象编程使得调用者只关心抽象方法的定义，不关心子类的具体实现。
abstract class Income{
    double income;

    Income(double income){
        this.income = income;
    }

    abstract double getTax();
}

class SalaryIncome extends Income{
    SalaryIncome(double income){
        super(income);
    }

    @Override
    double getTax() {
        return this.income * 0.1;
    }
}

class OtherIncome extends Income{
    OtherIncome(double income){
        super(income);
    }

    @Override
    double getTax() {
        return this.income * 0.05;
    }
}
