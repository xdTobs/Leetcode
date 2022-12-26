package S;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
PriorityQueue<Integer> smallHeap,largeHeap;
int smallSize,largeSize;

//sooo heap has a .size() and i forgot
    //also not the optimal solution i think, but right time complexity

    public MedianFinder() {
    smallHeap = new PriorityQueue<>(Collections.reverseOrder());
    largeHeap = new PriorityQueue<>();
    smallSize = 0;
    largeSize=0;
    }

    public void addNum(int num) {
        if (smallHeap.isEmpty()){
            smallHeap.add(num);
            smallSize++;
            return;
        }

        if (num<smallHeap.peek()){
            smallHeap.add(num);
            smallSize++;
        }
        else{
            largeHeap.add(num);
            largeSize++;
        }

        if (smallSize-largeSize>1){
            int endOfSmall = smallHeap.poll();
            largeHeap.add(endOfSmall);
            smallSize--;
            largeSize++;
        }
        else if(largeSize-smallSize>1){
            int endOfLarge = largeHeap.poll();
            smallHeap.add(endOfLarge);
            largeSize--;
            smallSize++;
        }



    }

    public double findMedian() {
        if (largeSize==0)return smallHeap.peek();
        double small =(double) smallHeap.peek();
        double large =(double) largeHeap.peek();
        if(smallSize==largeSize){
            return (small+large)/2;
        }
        else if(largeSize>smallSize){
            return large;
        }
        else{
            return small;
        }
    }

    public static void main(String[] args) {
        MedianFinder sol = new MedianFinder();
        sol.addNum(1);
        System.out.println(sol.findMedian());
        sol.addNum(2);
        System.out.println(sol.findMedian());
        sol.addNum(3);
        System.out.println(sol.findMedian());
        for (int i = 4; i < 12; i++) {
            sol.addNum(i);

        }
        System.out.println(sol.findMedian());
    }
}
