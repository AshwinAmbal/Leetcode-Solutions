/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
class Solution {
    public int orientation(Point x, Point y, Point z){
        int val = (y.y - x.y) * (z.x - y.x) - (y.x - x.x) * (z.y - y.y);
        if(val == 0) return 0;
        return val>0 ? 1 : 2;
    }
    
    public boolean inBetween(Point x, Point y, Point z){
        boolean a = y.x >= x.x && y.x <= z.x || y.x <= x.x && y.x>= z.x;
        boolean b = y.y >= x.y && y.y <= z.y || y.y <= x.y && y.y >= z.y;
        return a && b;
    }
    
   public List<Point> outerTrees(Point[] points) {
        int n = points.length, p = 0, q = 0;
        int leftmost = 0;
        for(int i = 0;i< n; i++){
            if(points[leftmost].x > points[i].x){
                leftmost = i;
                p = i;
            }
        }
        List<Point> finalset = new ArrayList<Point>();
       if (n < 4) {
            for (Point t: points)
                finalset.add(t);
            return finalset;
        }
        do{
            finalset.add(points[p]);
            q = (p+1)%n;
            for(int i = 0; i < points.length; i++){
                if(orientation(points[p], points[i], points[q]) == 2)
                    q = i;
            }
            for(int i = 0; i < points.length; i++){
                if(i!=p && i!=q && orientation(points[p], points[i], points[q]) == 0 && inBetween(points[p], points[i], points[q]))
                    finalset.add(points[i]);
            }
            p = q;
        }while(p != leftmost);
        return finalset;
    }
}