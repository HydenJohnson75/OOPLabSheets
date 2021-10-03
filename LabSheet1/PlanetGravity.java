package LabSheet1;
import java.util.*;

public class PlanetGravity {
    public static void main(String[] args) {
        float massOfOtherPlanet,massOfEarth,radiusOfEarth,radiusOfOtherPlanet;
        final float earthAcceleration = 9.81f;
        float accelerationOfOtherPlanet;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mass of the planet Earth:");
        massOfEarth = input.nextFloat();

        System.out.println("Please enter the radius of the planet Earth:");
        radiusOfEarth = input.nextFloat();

        System.out.println("Please enter the mass of the other planet :");
        massOfOtherPlanet = input.nextFloat();

        System.out.println("Please enter the radius of the other planet :");
        radiusOfOtherPlanet = input.nextFloat();

        accelerationOfOtherPlanet = ((earthAcceleration * massOfOtherPlanet)*(radiusOfEarth*radiusOfEarth)) / (massOfEarth*(radiusOfOtherPlanet*radiusOfOtherPlanet));

        System.out.println("The accleration due to gravity on the other planet is " + String.format("%.2f",accelerationOfOtherPlanet) + " m/s/s");
    }
}
