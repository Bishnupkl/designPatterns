package template;

public class Coffee  extends  CaffeineBeverage{
    void brew() {
        System.out.println("Dripping coffee thru filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");

    }

}
