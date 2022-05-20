public class Coordinate {

    private int x;
    private int y;
    private Coordinate[] coordinate;

    public Coordinate(int _x,int _y){
        x = _x;
        y = _y;
    }

    public void setCoordinate(int indice, Coordinate coordinate){
        this.coordinate[indice] = coordinate;
    }

    public Coordinate getCoordinate(){

    }

}
