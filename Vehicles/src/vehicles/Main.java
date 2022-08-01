package vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] car = scan.nextLine().split(" ");
        String[] truck = scan.nextLine().split(" ");

        VehicleAbstract carObj = new Car(Double.parseDouble(car[1]), Double.parseDouble(car[2]));
        VehicleAbstract truckObj = new Truck(Double.parseDouble(truck[1]), Double.parseDouble(truck[2]));

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("Drive")){
                if (input[1].equalsIgnoreCase("car")){
                    System.out.println(carObj.drive(Double.parseDouble(input[2])));
                }else{
                    System.out.println(truckObj.drive(Double.parseDouble(input[2])));
                }
            }else{
                if (input[1].equalsIgnoreCase("car")){
                   carObj.refuel(Double.parseDouble(input[2]));
                }else{
                    truckObj.refuel(Double.parseDouble(input[2]));
                }
            }
        }
        System.out.printf("Car: %.2f%nTruck: %.2f",carObj.getFuelQuantity(),truckObj.getFuelQuantity());
    }
}
