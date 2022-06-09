package functional;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CounterResult {

    private int negative;
    private int zero;
    private int positive;

    public void accept(int number){
        if(number < 0){
            negative++;
        } else if (number > 0) {
            positive++;
        }
        else {
            zero++;
        }
    }

    @Override
    public String toString() {
        return "CounterResult{" +
                "negative=" + negative +
                ", zero=" + zero +
                ", positive=" + positive +
                '}';
    }

    public CounterResult addAll(CounterResult another){
        negative += another.negative;
        zero += another.zero;
        positive += another.positive;

        return this;
    }

    public int getNegative() {
        return negative;
    }

    public int getZero() {
        return zero;
    }

    public int getPositive() {
        return positive;
    }

    public static Collector<Integer,CounterResult,CounterResult> collector(){
        return Collector.of(CounterResult::new,CounterResult::accept,CounterResult::addAll, Collector.Characteristics.UNORDERED,
                Collector.Characteristics.IDENTITY_FINISH);
    }
}
