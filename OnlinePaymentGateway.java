import java.util.Scanner;

class Gateway{
    int amount;

    Gateway(int amount) {
        this.amount = amount;
    }

    double calculateAmount(){
        return 0;
    }
}

class CreditCard extends Gateway {
    double reduction = 0.02;

    CreditCard(int amount) {
        super(amount);
    }

    @Override
    double calculateAmount(){
        return amount + (reduction * amount);
    }
}

class DebitCard extends Gateway {
    double reduction = 0.01;

    DebitCard(int amount) {
        super(amount);
    }

    @Override
    double calculateAmount(){
        return amount + (amount * reduction);
    }
}

class UPI extends Gateway {
    double reduction = 0.0;

    UPI(int amount) {
        super(amount);
    }

    @Override
    double calculateAmount(){
        return amount + (amount * reduction);
    }
}

public class OnlinePaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the payment gateway type: ");
        String gateway = sc.nextLine();

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        if(gateway.equals("CreditCard")){
            Gateway g1 = new CreditCard(amount);
            System.out.println("Amount deducted: " + g1.calculateAmount());
        }else if(gateway.equals("DebitCard")){
            Gateway g2 = new DebitCard(amount);
            System.out.println("Amount deducted: " + g2.calculateAmount());
        }else if(gateway.equals("UPI")){
            Gateway g3 = new DebitCard(amount);
            System.out.println("Amount deducted: " + g3.calculateAmount());
        }

    }
}
