public class M11 {
    public static int maxArea(int[] height) {
int L =0;
int R = height.length-1;
        int area =0,bigArea=1;
while (L<R){
    area = (Integer.min(height[R],height[L]))*(R-L);
    if (area>bigArea)bigArea=area;
    if (height[L]>height[R]){
        R--;
    }else{
        L++;
    }

}
return bigArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
