class TwoD{
    int x, y;
    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class ThreeD extends TwoD{
    int z;
    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
class FourD extends ThreeD{
    int t;
    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] coords){
        this.coords = coords;
    }
    static void showXY(Coords<?> c){
        System.out.println("XY Coordinates: ");
        for(int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }
    static void showXYZ(Coords<? extends  ThreeD> c){
        System.out.println("XYZ Coordinates: ");
        for(int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }
}
public class BoundedWildCardDemo {
    TwoD[] tds = new TwoD[2];
    Coords<TwoD> c = new Coords<>(tds);
}
