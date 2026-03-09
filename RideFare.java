import java.util.Scanner;

class Ride{
    int baseFare;
    int distance;

    Ride(int baseFare, int distance) {
        this.baseFare = baseFare;
        this.distance = distance;
    }

    int calculateFare(){
        return 0;
    }
}

class Mini extends Ride{
    int additionalCharges = 100;
    Mini(int baseFare, int distance){
        super(baseFare, distance);
    }

    @Override
    int calculateFare(){
        return baseFare + (additionalCharges * distance);
    }
}

class Sedan extends Ride{
    int additionalCharges = 200;
    Sedan(int baseFare, int distance){
        super(baseFare, distance);
    }

    @Override
    int calculateFare(){
        return baseFare + (additionalCharges * distance);
    }
}

class SUV extends Ride{
    int additionalCharges = 250;
    SUV(int baseFare, int distance){
        super(baseFare, distance);
    }

    @Override
    int calculateFare(){
        return baseFare + (additionalCharges * distance);
    }
}
public class RideFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Car: ");
        String car = sc.nextLine();

        System.out.print("Enter the fare: ");
        int baseFare = sc.nextInt();

        System.out.print("Enter distance to be covered: ");
        int distance = sc.nextInt();

        if(car.equals("Mini")){
            Ride r1 = new Mini(baseFare, distance);
            System.out.println("Total fare: " + r1.calculateFare());
        }else if(car.equals("Sedan")){
            Ride r2 = new Sedan(baseFare, distance);
            System.out.println("Total fare: " + r2.calculateFare());
        }else if(car.equals("SUV")){
            Ride r3 = new Sedan(baseFare, distance);
            System.out.println("Total fare: " + r3.calculateFare());
        }
    }
    

}
