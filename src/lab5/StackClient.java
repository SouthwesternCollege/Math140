package lab5;

public class StackClient {
    public static void main(String[] args) {
        ArrayStack<Integer> numbers = new ArrayStack<>();
        numbers.push(3421);
        numbers.push(4);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        numbers.push(6);
        numbers.push(7);
        for (int number: numbers) {
            System.out.println(number);
        }

        LinkedListStack<String> names = new LinkedListStack<>();
        names.push("John");
        names.push("Paul");
        names.push("Ringo");
        names.push("George");
        names.push("Larry");
        names.push("Curly");
        names.push("Moe");
        for (String name:names) {
            System.out.println(name);
        }
        names.pop();
        names.pop();
        names.pop();
        for (String name:names) {
            System.out.println(name);
        }
    }
}
