package vehicles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] car = scan.nextLine().split(" ");
        String[] truck = scan.nextLine().split(" ");
        String[] bus = scan.nextLine().split(" ");

        VehicleAbstract carObj = new Car(Double.parseDouble(car[1]), Double.parseDouble(car[2]), Integer.parseInt(car[3]));
        VehicleAbstract truckObj = new Truck(Double.parseDouble(truck[1]), Double.parseDouble(truck[2]), Integer.parseInt(truck[3]));
        VehicleAbstract busObj = new Bus(Double.parseDouble(bus[1]), Double.parseDouble(bus[2]), Integer.parseInt(bus[3]));
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("Drive")) {
                if (input[1].equalsIgnoreCase("car")) {
                    System.out.println(carObj.drive(Double.parseDouble(input[2])));
                } else if (input[1].equalsIgnoreCase("truck")) {
                    System.out.println(truckObj.drive(Double.parseDouble(input[2])));
                } else {//bus
                    ((Bus) busObj).setConsumptionWithPeople();
                    System.out.println(busObj.drive(Double.parseDouble(input[2])));
                }
            } else if (input[0].equalsIgnoreCase("DriveEmpty") && input[1].equalsIgnoreCase("bus")) {
                ((Bus) busObj).unsetConsumtionWithPeople();
                System.out.println(busObj.drive(Double.parseDouble(input[2])));
            } else {
                if (input[1].equalsIgnoreCase("car")) {
                    try {
                        carObj.refuel(Double.parseDouble(input[2]));
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }

                } else if (input[1].equalsIgnoreCase("truck")) {
                    try {
                        truckObj.refuel(Double.parseDouble(input[2]));
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }else{
                    try{
                        busObj.refuel(Double.parseDouble(input[2]));
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }


        System.out.printf("Car: %.2f%nTruck: %.2f%nBus: %.2f", carObj.getFuelQuantity(), truckObj.getFuelQuantity(), busObj.getFuelQuantity());
    }
}
