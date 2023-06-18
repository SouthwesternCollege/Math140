package lab6;

public class QueueClient {
    public static void main(String[] args) {
        ArrayQueue<Double> prices = new ArrayQueue<>();

        System.out.println(prices.isEmpty());
        System.out.println(prices.size());

        prices.enqueue(3.14);
        prices.enqueue(2.72);
        prices.enqueue(13.99);
        prices.dequeue();

        for (double price:prices) {
            System.out.println(price);
        }

        System.out.println(prices.isEmpty());
        System.out.println(prices.size());

        LinkedListQueue<String> usernames = new LinkedListQueue<>();

        System.out.println(usernames.isEmpty());
        System.out.println(usernames.size());

        usernames.enqueue("rsoto");
        usernames.enqueue("jsmith");
        usernames.enqueue("techno_killer666");

        for (String user:usernames) {
            System.out.println(user);
        }

        usernames.dequeue();

        for (String user:usernames) {
            System.out.println(user);
        }

        System.out.println(usernames.isEmpty());
        System.out.println(usernames.size());

    }
}
