public class VehicleDemo {
    
    public void compareVehicles(Vehicle v1, Vehicle v2) {
        System.out.println("\n" + v1.toString());
        System.out.println("\n" + v2.toString() + "\n");
        if (v1.getMaxSpeed() > v2.getMaxSpeed()) {
            System.out.println(v1.getName() + " is faster than " + v2.getName() + "\n");
        } else if (v1.getMaxSpeed() < v2.getMaxSpeed()) {
            System.out.println(v2.getName() + " is faster than " + v1.getName() + "\n");
        } else {
            System.out.println(v1.getName() + " and " + v2.getName() + " have the same speed" + "\n");
        }
    }
}
