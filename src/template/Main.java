package template;

public class Main {

    public static void main(String[] args) {


        System.out.println("Template start here");
        System.out.println("--------------------------------------------------------------------------  ");

        CaffeineBeverage tea = new Tea();
        tea.prepareRceipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRceipe();
        System.out.println("Template ends here");
        System.out.println("--------------------------------------------------------------------------  ");

    }
}
