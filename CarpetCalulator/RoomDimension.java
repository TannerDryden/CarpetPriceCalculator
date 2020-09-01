package CarpetCalulator;

public class RoomDimension {
    double length;
    double width;

    RoomDimension(double len, double wid){
        length = len;
        width = wid;
    }

    double getArea(){
        return(length*width);
    }

//    String toString(){
//
//    }
}
