import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    // (1a) Write a function that receives an array of integers and returns the sum of its elements.
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // (2a) Write a function that receives an integer array and an integer parameter key and returns the index of the first element in the array that is equal to key. If no such element exists, return -1.
    public static int getIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }    

    // (2b) (b)	Write a function that receives an array of integers and an integer parameter key. The function uses The Array class methods, to sort and conduct a binary search for the key parameter in the array. The function must return the index of the key in the array if search is successful or -1 if search fails.
    public static int getIndexBinarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        // (1b) declare an integer array of size 10.
        int[] intArr = new int[10];
        Random rand = new Random();
        
        // (1b) use a random number generator to fill the array with random integers between 10 and 20.
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(20-10) + 10;;
        }
        
        System.out.println("\n*Answer 1*");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");
        }

        // (1b) invoke the funtion from part a and present the returned vaue in the main method.
        System.out.println("Sum of array: " + getSum(intArr));

        // (2c) invoke the functions from parts 2a and 2b and present the returned values in the main method.
        int[] testArray = {13, 8, 4, 64, 92, 6, 37, 19, 41, 11};
        System.out.println("\n*Answer 2*");
        System.out.println("Index of 8 in linear search: " + getIndex(testArray, 8));
        System.out.println("Index of 20 in linear search: " + getIndex(testArray, 20));
        System.out.println("Index of 8 in binary search: " + getIndexBinarySearch(testArray, 8));
        System.out.println("Index of 20 in binary search: " + getIndexBinarySearch(testArray, 20));

        // (3c) Compare which of two vehicles is faster and print the results.
        System.out.print("\n*Answer 3*");
        Car c = new Car("2023 Bugatti Chiron", 273, 16);
        Airplane a = new Airplane("Boeing 787", 740, 2);
        VehicleDemo vd = new VehicleDemo();
        vd.compareVehicles(c, a);

        // (4a) Write a main program in which an ArrayList of Car objects is created. Populate the array list with 5 different cars. Then write a loop to display each car object in the array.
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("2023 Bugatti Chiron", 273, 16));
        carList.add(new Car("2021 Ferrari 488 Pista", 211, 8));
        carList.add(new Car("1993 Vector W8", 242, 8));
        carList.add(new Car("2022 Audi R8", 204, 10));
        carList.add(new Car("1974 Ford Pinto", 94, 6));
        System.out.println("\n*Answer 4a*");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i) + "\n");
        }

        System.out.println("\n*Answer 4b*");
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getName().equals("2022 Audi R8")) {
                carList.get(i).changeSpeed(carList.get(i), 200);;
            }
            else {
                continue;
            }
        }
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i) + "\n");
        }
    }
}
