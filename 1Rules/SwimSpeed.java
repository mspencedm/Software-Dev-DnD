import java.util.Scanner;

public class SwimSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input constitution modifier
        System.out.print("Enter constitution modifier: ");
        int constitutionModifier = scanner.nextInt();

        // Input speed
        System.out.print("Enter speed in feet: ");
        int speed = scanner.nextInt();

        // Calculate distance a creature can travel in 6 seconds
        int distanceInSixSeconds = speed / 2;

        // Calculate the number of minutes a creature can hold its breath
        int minutesHoldBreath = 1 + constitutionModifier;

        // Calculate the distance a creature can travel during the time it can hold its breath
        int distanceInHoldBreath = distanceInSixSeconds * (minutesHoldBreath * 10); // 10 rounds per minute

        System.out.println("Distance a creature can travel in 6 seconds: " + distanceInSixSeconds + " feet");
        System.out.println("Number of minutes a creature can hold its breath: " + minutesHoldBreath);
        System.out.println("Distance a creature can travel while holding its breath: " + distanceInHoldBreath + " feet");

        scanner.close();
    }
}
