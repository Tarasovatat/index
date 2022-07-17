public class Main {

        public static void main(String[] args) {
            BmiService service = new BmiService ();

            int weigth = 60;
            double height = 1.72;

            double index = service.calculate(weigth, height);

            System.out.println("BMI = " + index);


    }
}
