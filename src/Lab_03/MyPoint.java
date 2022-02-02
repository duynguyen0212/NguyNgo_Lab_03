/*
    Name: Ngoc Duy Nguyen
    Date: 2/1/2022
    Description: Working with Objects and static methods
 */
package Lab_03;
public class MyPoint {
    private double x;
    private double y;

    public double getX(){
        return x;
    }
    public void setX(double X){
        this.x = X;
    }
    public double getY(){
        return y;
    }
    public void setY(double Y){
        this.y = Y;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public MyPoint(){
        this(5.0,1.0);
    }
    public String toString(){
        return "Co-ordinate: " + "(" + x + "," + y + ")";
    }
    /**
     * Calculate the distance between two points
     * @param p1 My point.
     */
    public double distance(MyPoint p1){
        p1.x = this.x - p1.x;
        p1.y = this.y - p1.y;
        double dis;
        dis = Math.sqrt((p1.x)*(p1.x) + (p1.y)*(p1.y));
        return dis;
    }
    /**
     * Check if points are equal
     */
    public static boolean areEqual(MyPoint p, MyPoint[] points){
        boolean flag = false;
        for(int i = 0; i< points.length; i++) {
            if (p.x == points[i].x && p.y == points[i].y){
                flag = true;
                break;
            }
        }
        return flag;
    }
    /**
     * Check if points are horizontal
     */
    public static boolean horizontal(MyPoint[] points){
        boolean check = true;
        for(int i = 0; i<points.length; i++){
            for(int j = 1; j<points.length;j++){
                if(points[i].x != points[j].x) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
    /**
     * Main function
     */
    public static void main(String args[]){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2.0, 5.0);
        MyPoint p = new MyPoint(3.0, 4.0);

        System.out.println("p " + p);
        System.out.println("p1 " + p1);
        System.out.println("p2 " + p2);

        double distance = p2.distance(p1);
        System.out.print("\nDistance between p2 and p1 is: " + distance);

        MyPoint a = new MyPoint(3.0,2.0);
        MyPoint b = new MyPoint(3.0,4.0);
        MyPoint c = new MyPoint(3.0,2.0);
        MyPoint[] points = {a,b,c };

        System.out.print("\nCheck if p contains in array points: " + areEqual(p, points));
        System.out.print("\nCheck if array points is horizontal line: " + horizontal(points));
    }
}
