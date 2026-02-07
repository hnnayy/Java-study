package car.example.construction.injection;

public class Car {
    private Specification specification;

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
