public class JavaProject {
    public static void main(String[] args) {
        //variables
//        int numberOfFollowers = 70;
//        numberOfFollowers=69;
//        System.out.println(numberOfFollowers);

//        DataType
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 683434879349821212L; //add L

        float fuelConsumptionCombined = 15.5F; //add F
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 153.234567890987E-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: " + price + " euro");
        System.out.println("Mileage: " + mileage);
        System.out.println("The car is damaged:" + isDamaged);
        System.out.println("Registration Number:" + registrationNumber);
        System.out.println("Registration Number:" + registrationNumber);
        System.out.println("Cubic capacity:" + cubicCapacity);
        System.out.println("Power:" + power + "KW(" + horsePower + " hp)");
        System.out.println("CO2 emission:" + co2Emission + " g/km");
        System.out.println("Emission sticker :" + emissionSticker + "(Energy Efficiency :" + energyEfficiencyCategory + " )");
        System.out.println("Fuel Consumption Combined: " + fuelConsumptionCombined + " 1/100km");
        System.out.println("Fuel Consumption Urban: " + fuelConsumptionUrban + " 1/100km");
        System.out.println("Fuel Consumption Extra Urban: " + fuelConsumptionExtraUrban + "1 /100km");
        System.out.println("Fuel Consumption Precise Average: " + fuelConsumptionPreciseAverage + " 1/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number Of Doors: " + numberOfDoors);
        System.out.println("Number Of Seats: " + numberOfSeats);

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("New value of number of seats: " + newNumberOfSeats);

        int newMileage = mileage;
        System.out.println("New value of mileage: " + newMileage);

        byte newPower = (byte) power;
        System.out.println("New value of Power: " + newPower);
    }
}
