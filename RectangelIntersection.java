package Chapter1;
// Check whether the two rectangles are intersecting ot not and if they are intersecting give the intersection area
class Rectangle{
    int x,y,H,W;

    Rectangle(int x,int y,int W,int H){
        this.x = x;
        this.y = y;
        this.H = H;
        this.W = W;
    }
}

class RectangleIntersection {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1,1,2,2);
        Rectangle r2 = new Rectangle(1,4,2,2);
        System.out.println(area(r1,r2));
    }

    public static double area(Rectangle r1,Rectangle r2){
        int x_intersection = Math.abs(Math.max(r1.x,r2.x) - Math.min(r1.x+r1.W,r2.x+r2.W));
        int y_intersection = Math.abs(Math.max(r1.y,r2.y) - Math.min(r1.y+r1.H,r2.y+r2.H));
        if(x_intersection == 0 || y_intersection == 0)
            return 0;   // not intersecting
        return x_intersection * y_intersection;

    }
}
