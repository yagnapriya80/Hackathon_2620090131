import java.util.Scanner;

public class TotalEnergy {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy: ");
        double eveningEnergy = sc.nextDouble();

        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + total + " kWh");
    }
}