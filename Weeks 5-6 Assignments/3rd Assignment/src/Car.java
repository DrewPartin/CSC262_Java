public class Car extends Vehicle {
    private int number_of_cyliners;
    public int getNumber_of_cyliners() {
        return number_of_cyliners;
    }
    public void setNumber_of_cyliners(int number_of_cyliners) {
        this.number_of_cyliners = number_of_cyliners;
    }
    public Car() {
        setName("");
        setMaxSpeed(0);
        number_of_cyliners = 0;
    }
    public Car(String name, int maxSpeed, int number_of_cyliners) {
        setName(name);
        setMaxSpeed(maxSpeed);
        this.number_of_cyliners = number_of_cyliners;
    }
    public String toString() {
        return "Car: " + this.getName() + "\nMax Speed: " + this.getMaxSpeed() + "mph" + "\nNumber of Cylinders: " + this.getNumber_of_cyliners();
    }
    public void changeSpeed(Car car, int newSpeed) {
        car.setMaxSpeed(newSpeed);
    }
}
