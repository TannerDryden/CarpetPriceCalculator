package CarpetCalulator;

public class RoomCarpet {
    RoomDimension size;
    double carpetCost;


    RoomCarpet(RoomDimension dim, double cost){
        size=dim;
        carpetCost=cost;
    }

    double getTotalCost(){
        return (size.getArea() * carpetCost);
    }

   public String toString(){
        return(size.toString() + "\nCost: " + getTotalCost());
   }
}
