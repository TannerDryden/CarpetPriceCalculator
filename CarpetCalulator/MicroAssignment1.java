/*
Name: Tanner Dryden
CPTS 233: MicroAssignment #1
Date: 8/30/2020
gitRepo url: https://github.com/TannerDryden/MicroAssignment1
*/

package CarpetCalulator;

import java.util.Scanner;

public class MicroAssignment1 {
    public static void main(String [] args){
        double length;
        double width;
        double cost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the carpet in ft: ");
        length = sc.nextDouble();

        System.out.println("Enter the width of the carpet in ft: ");
        width = sc.nextDouble();

        System.out.println("Enter the cost of the carpet per ft: ");
        cost = sc.nextDouble();

        RoomDimension roomDimension = new RoomDimension(length,width);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension,cost);

        System.out.println(roomCarpet.toString());

    }


}
