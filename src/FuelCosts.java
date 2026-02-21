import java.util.Scanner;

void main() {
    double gallons;
    double milesPerGallon;
    double costPerGallon;
    double costPer100Miles;
    double howFarCanGo;

    boolean done = false;
    String trash;
    Scanner in = new Scanner(System.in);

    do {
        System.out.print("Enter the number of gallons: ");
        if (in.hasNextDouble()) {
            gallons = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            continue;
        }
        System.out.print("Enter the miles per gallon: ");
        if (in.hasNextDouble()) {
            milesPerGallon = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            continue;
        }
        System.out.print("Enter the cost per gallon: ");
        if (in.hasNextDouble()) {
            costPerGallon = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            continue;
        }
        costPer100Miles = 100 / milesPerGallon * costPerGallon;
        howFarCanGo = gallons * milesPerGallon;
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("How far can go: " + howFarCanGo + " miles");
        System.out.print("Are you done? (Y/N): ");
        done = in.nextLine().equals("N");


    } while (!done);
}