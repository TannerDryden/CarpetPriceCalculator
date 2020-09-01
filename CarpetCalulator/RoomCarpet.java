package CarpetCalulator;

public class RoomCarpet {
    RoomDimension size;
    double carpetCost;

    RoomCarpet(RoomDimension dim, double cost){

        carpetCost=cost;

    }

    double getTotalCost(){
        return (size.getArea() * carpetCost);
    }

//   String toString(){
//
//   }
}
