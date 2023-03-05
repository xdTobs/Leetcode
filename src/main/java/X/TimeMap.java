package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class TimeValue {
    String val;
    int timestamp;

    public TimeValue(String val, int time) {
        this.val = val;
        timestamp = time;
    }
}

public class TimeMap {
    HashMap<String, List<TimeValue>> map = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new TimeValue(value, timestamp));
    }

    public String get(String key, int timestamp) {


        if (!map.containsKey(key)) return "";
        List<TimeValue> timeStamps = map.get(key);
        int left = 0;
        int right = timeStamps.size() - 1;
        if (timeStamps.get(left).timestamp > timestamp) return "";
        if (timeStamps.get(timeStamps.size() - 1).timestamp <= timestamp)
            return timeStamps.get(timeStamps.size() - 1).val;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (timeStamps.get(mid).timestamp == timestamp) return timeStamps.get(mid).val;
            if (timeStamps.get(mid).timestamp < timestamp) left = mid + 1;
            else {
                right = mid - 1;
            }
        }
        return timeStamps.get(left - 1).val;

    }

    public static void main(String[] args) {
        TimeMap tm = new TimeMap();
        tm.set("foo", "bar", 1);
        System.out.println(tm.get("foo", 1));
        tm.get("foo", 3);
        tm.set("foo", "bar2", 4);
        System.out.println(tm.get("foo", 4));
        tm.get("foo", 5);


    }

}
