import java.util.HashMap;
import java.util.Map;


public class MapTimer extends Decorator{
    int time;

    public MapTimer(HashMap map) {
        super(map);
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void timeTick() throws InterruptedException {
        time--;
        Thread.sleep(1000);
    }

    @Override
    public Object get(Object key) {
        if (time <= 0) {
            return null;
        } else {
            return map.get(key);
        }
    }
    @Override
    public Object put(Object key, Object value) {
        setTime(max_time);
        return map.put(key,value);
    }
    @Override
    public void putAll(Map m) {
        setTime(max_time);
        map.putAll(m);
    }

    final int max_time = 5;
}