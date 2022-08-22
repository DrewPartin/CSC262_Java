public class Airplane extends Vehicle {
    private int number_of_engines;
    public int getNumber_of_engines() {
        return number_of_engines;
    }
    public void setNumber_of_engines(int number_of_engines) {
        this.number_of_engines = number_of_engines;
    }
    public Airplane() {
        setName("");
        setMaxSpeed(0);
        number_of_engines = 0;
    }
    public Airplane(String name, int maxSpeed, int number_of_engines) {
        setName(name);
        setMaxSpeed(maxSpeed);
        this.number_of_engines = number_of_engines;
    }
    public String toString() {
        return "Airplane: " + this.getName() + "\nMax Speed: " + this.getMaxSpeed() + "\nNumber of Engines: " + this.getNumber_of_engines();
    }
}
