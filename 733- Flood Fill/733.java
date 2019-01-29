class Solution {
    class point{
        public int x, y;
        point(int x1, int y1){
            x = x1;
            y = y1;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor == image[sr][sc])
            return image;
        int given = image[sr][sc];
        image[sr][sc] = newColor;
        Stack <point> stack = new Stack <point> ();
        stack.push(new point(sr, sc));
        while(stack.isEmpty() != true){
            point p = stack.pop();
            if(p.x - 1 >= 0 && image[p.x-1][p.y] == given){
                image[p.x-1][p.y] = newColor;
                stack.push(new point(p.x - 1, p.y));
            }
            if(p.x + 1 < image.length && image[p.x+1][p.y] == given){
                image[p.x+1][p.y] = newColor;
                stack.push(new point(p.x + 1, p.y));
            }
            if(p.y-1 >= 0 && image[p.x][p.y-1] == given){
                image[p.x][p.y-1] = newColor;
                stack.push(new point(p.x, p.y-1));
            }
            if(p.y+1 < image[0].length && image[p.x][p.y+1] == given){
                image[p.x][p.y+1] = newColor;
                stack.push(new point(p.x, p.y+1));
            }
        }
        return image;
    }
}