import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> timerMap = new MapTimer(new HashMap<Integer, String>());

        timerMap.put(1,"1");
        timerMap.put(2,"2");

        //Время хранения данных - 5 секунд
        for (int i = 0; i < 6; i++){
            System.out.println(timerMap.get(1));
            System.out.println(timerMap.get(2));
            System.out.println();
            ((MapTimer) timerMap).timeTick();
        }

    }
}