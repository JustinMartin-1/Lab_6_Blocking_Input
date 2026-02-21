import java.util.Scanner;

void main() {
    double length;
    double width;
    double area;
    double diagonal;
    boolean done = false;
    String trash;
    Scanner in = new Scanner(System.in);

    do {
        System.out.print("Enter the length of the rectangle: ");
        if (in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            continue;
        }
        System.out.print("Enter the width of the rectangle: ");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            continue;
        }
        area = length * width;
        diagonal = Math.sqrt(length * length + width * width);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Diagonal of the rectangle: " + diagonal);
        System.out.print("Are you done? (Y/N): ");
        done = in.nextLine().equals("N");
    } while (!done);
}