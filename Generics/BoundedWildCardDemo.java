class TwoD{
    int x, y;
    public TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class ThreeD extends TwoD{
    int z;

    public ThreeD(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD{
    int q;

    public FourD(int x, int y, int z, int q) {
        super(x, y, z);
        this.q = q;
    }
}
public class BoundedWildCardDemo {
    public static void main(String[] args) {

    }
}
// complete