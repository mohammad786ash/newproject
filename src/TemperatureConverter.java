public class TempratureConverter {
    public static void main(String[] args) {
        Temprature temprature = new Temprature ()


        public double toCelsius(double f){
            double c;
            c = (f - 32.0) / 1.8;
            return c;
        }
        public double toFahrenheit(double c){
            double f;
            f = (c * 1.8) + 32.0;
            return f;
        }
    }
}
