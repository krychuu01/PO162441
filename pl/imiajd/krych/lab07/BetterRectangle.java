package pl.imiajd.krych;

public class BetterRectangle extends java.awt.Rectangle{

    public BetterRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
//        super.setLocation(x, y);
//        super.setSize(width, height);
    }

    // liczy obwod prostokata
    public int getPerimeter(){
        return this.width*2 + this.height*2;
    }

    // liczy powierzchnie prostokata
    public int getArea(){
        return this.width * this.height;
    }

    public static void main(String[] args){
        BetterRectangle rect = new BetterRectangle(2, 2, 5, 4);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

    }
}
