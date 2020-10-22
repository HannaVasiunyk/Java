import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task number:");

        switch (scanner.nextInt()) {
            case 1: {
                calculatePerimeterAndArea();
                break;
            }
            case 2: {
                readUserInfo();
                break;
            }
            case 3: {
                countCallUnits();
                break;
            }
            default: {
                System.out.println("Invalid task number");
            }
        }
        scanner.close();
    }

    private static void calculatePerimeterAndArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + perimeter);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area = " + area);

        sc.close();
    }

    private static void readUserInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();

        System.out.println(String.format("Where are you live, %s ?", name));
        String address = sc.next();

        System.out.println("Name :" + name);
        System.out.println("Address : " + address);
        sc.close();
    }

    private static void countCallUnits() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit per minutes for first county: ");
        double firstCountryUnitsPerMinute = sc.nextDouble();

        System.out.println("Enter call minutes for first country: ");
        double firstCountryCallMinutes = sc.nextDouble();

        System.out.println("Enter unit per minutes for second county: ");
        double secondCountryUnitsPerMinute = sc.nextInt();

        System.out.println("Enter call minutes for second country: ");
        double secondCountryCallMinutes = sc.nextDouble();

        System.out.println("Enter unit per minutes for third county: ");
        int thirdCountryUnitsPerMinute = sc.nextInt();

        System.out.println("Enter call minutes for third country: ");
        double thirdCountryCallMinutes = sc.nextDouble();

        double countForFirstCountry = firstCountryUnitsPerMinute * firstCountryCallMinutes;
        double countForSecondCountry = secondCountryUnitsPerMinute * secondCountryCallMinutes;
        double countForThirdCountry = thirdCountryUnitsPerMinute * thirdCountryCallMinutes;

        System.out.println("Count for first country: " + countForFirstCountry);
        System.out.println("Count for second country: " + countForSecondCountry);
        System.out.println("Count for third country: " + countForThirdCountry);

        double allCounts = countForFirstCountry + countForSecondCountry + countForThirdCountry;

        System.out.println("All counts: " + allCounts);
        sc.close();

    }
}
