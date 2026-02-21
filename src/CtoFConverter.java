import java.util.Scanner;


void main() {
    double tempC;
    double tempF;
    boolean done = false;
    String trash;
    Scanner in = new Scanner(System.in);

    do {
        System.out.print("Enter a temperature in Celsius: ");
        if (in.hasNextDouble()) {
            tempC = in.nextDouble();
            in.nextLine();
            tempF = tempC * 9 / 5 + 32;
            System.out.println(tempC + " degrees Celsius is " + tempF + " degrees Fahrenheit.");
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
        System.out.print("Do you want to convert another temperature? (Y/N): ");
        done = in.nextLine().equals("N");
    } while (!done);
}