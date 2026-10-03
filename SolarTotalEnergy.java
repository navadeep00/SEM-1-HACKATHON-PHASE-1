import java.util.Scanner;

public class SolarTotalEnergy {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy generated (KWH): ");
        double morning = sc.nextDouble();
        System.out.print("Enter evening energy generated (KWH) : ");
        double evening = sc.nextDouble();
        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + total + " kWh");
        sc.close();
    }
}