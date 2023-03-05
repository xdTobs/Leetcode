package M;

import java.util.*;

public class M853 {
    public static int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> fleets = new Stack<>();
        List<Integer[]> cars = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            cars.add(new Integer[]{position[i],speed[i]});
        }
        cars.sort(Comparator.comparing(o -> o[0]));
        for (int i = position.length-1; i >=0; i--) {
            fleets.push( (((double)target-(double)cars.get(i)[0])/(double)cars.get(i)[1]));
            if (fleets.size() >= 2) {
                double currTime = fleets.pop();
                if(!(currTime<=fleets.peek()))
                    fleets.push(currTime);
            }
        }
        return fleets.size();
    }

    public static void main(String[] args) {
        System.out.println(carFleet(10,new int[]{6,8},new int[]{3,2}));
    }
}
