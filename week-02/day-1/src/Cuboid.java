public class Cuboid {
    public static void main(String[] args) {


// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000

        double firstSide = 3.00;
        double secondSide = 6.00;
        double thirdSide = 9.00;
        double surfaceArea = (firstSide * secondSide) + (secondSide + thirdSide) + (thirdSide + firstSide);
        double volume = firstSide * secondSide * thirdSide;


        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);


    }

}