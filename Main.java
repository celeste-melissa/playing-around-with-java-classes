public class Main {
    public static void main(String[] args) {
        Person individual = new Person();
        individual.name = "Celeste";
        Car car = new Car();
        car.model= "Kia";
        car.person = individual;

        System.out.println(car);
    }
}
