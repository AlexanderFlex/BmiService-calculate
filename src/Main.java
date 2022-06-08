public class Main {

    public static void main(String[] args) {

        double m = 70;
        double h = 1.75;

        BmiService bmi = new BmiService();

        double I = bmi.calculate(m, h);

        System.out.println(" Текущий индекс массы тела " + I + " кг/м2 ");

    }
}
