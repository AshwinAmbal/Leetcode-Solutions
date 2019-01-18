class Solution {
    public int fib(int N) {
        int i = 1, j = 0;
        int k = 0, h = 1, t;
        while(N > 0){
            if(N % 2 != 0){
                t = i * h;
                i = i * k + j * h;
                j = t + j * k + j * h;
            }
            t = h * h;
            h = h = 2 * k * h + t;
            k = k * k + t;
            N /= 2;
        }
        return j;
    }
}