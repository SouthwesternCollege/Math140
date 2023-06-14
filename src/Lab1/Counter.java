package Lab1;

public class Counter implements Comparable<Counter>{
    private int count;
    private final String name;

    public Counter(String name) {
        this.name = name;
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() throws Exception {
        if (count == 0) {
            throw new Exception("count is zero!");
        }
        count--;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return name + ": " + count;
    }

    public int compareTo(Counter that) {
        return this.count - that.count;
    }

}
