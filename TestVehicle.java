import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Hi. You are in a Vehicle Project Menu. Pleas enter the command number.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1.Create an Electric Car.And do all functions.");
        System.out.println("2.Create a Race Car.And do all functions.");
        System.out.println("3.Create a Plane.And do all functions.");
        System.out.println("4.Create a Boat.And do all functions.");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        switch (n)        //I wrote this way to not input all fields every time
                          //if we need many objects of the same type I could use an array))
        {
            case 1:
            {
                ElectricCar myElCar = new ElectricCar("Smart1","Fortwo","UK",2010,2 );
                myElCar.setHorsePower(100);
                myElCar.setEngine("none");
                myElCar.setDriveType("2 wheel");
                myElCar.setBatteries("1000");
                myElCar.setWorkHours(24);
                ElectricCar myElCar1 = new ElectricCar("Smart","Fortwo","UK",2010,2 );
                myElCar1.setHorsePower(100);
                myElCar1.setEngine("none");
                myElCar1.setDriveType("2 wheel");
                myElCar1.setBatteries("1000");
                myElCar1.setWorkHours(24);
                ElectricCarService elService = new ElectricCarService();
                elService.writeInFile(myElCar);
                elService.writeInFile(myElCar1);
                ElectricCar[] arr =elService.readFromFile();
                arr[0].Print();
               // arr[1].Print();
                elService.inspection();
                elService.inspectionCenters();
                elService.storyOfInvention();

            }
            break;
            case 2:
            {
                RaceCar myCar= new RaceCar("Lexus","GX 470","Japan",2005,8);
                myCar.setDriveType("4 wheel");
                myCar.setEngine("V8");
                myCar.setFuelType("Petrol");
                myCar.setHorsePower(263);
                myCar.setMaxSpeed(300);
                myCar.setAcceleration(23);
                RaceCarService raceService = new RaceCarService();
                raceService.writeInFile(myCar);
                RaceCar[] arr1 = raceService.readFromFile();
                arr1[0].Print();
                raceService.inspection();
                raceService.inspectionCenters();
                raceService.storyOfInvention();
                System.out.println("----------------------------------------------------------------");
            }
            break;
            case 3: {
                Plane myPlane = new Plane("Boeing","737","USA",1980,215);
                myPlane.setHours(76);
                myPlane.setWingspan(25.7);
                myPlane.setMilitary(false);
                myPlane.Print();
                PlaneService planeService = new PlaneService();
                planeService.writeInFile(myPlane);
                Plane[] arr2 = planeService.readFromFile();
                arr2[0].Print();
                planeService.inspection();
                planeService.inspectionCenters();
                planeService.storyOfInvention();
                System.out.println("------------------------------------------------------------------");
            }
            break;
            case 4:
            {
                Boat myBoat = new Boat("OEM","Hovercraft","China",2010,3);
                myBoat.setLength(480);
                myBoat.setPropeller(2);
                myBoat.setMilitary(false);
                BoatService boatService = new BoatService();
                boatService.writeInFile(myBoat);
                Boat[] arr3 = boatService.readFromFile();
                arr3[0].Print();
                boatService.inspection();
                boatService.inspectionCenters();
                boatService.storyOfInvention();

            }
          break;
        }


    }
}
