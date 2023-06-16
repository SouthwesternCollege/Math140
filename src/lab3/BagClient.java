package lab3;

public class BagClient {
    public static Bag<Integer> union(Bag<Integer> a, Bag<Integer> b) {
        Bag<Integer> union = new Bag<>();
        for (int num1:a) {
            boolean found = false;
            for (int numUnion: union) {
                if(num1 == numUnion) {
                    found = true;
                    break;
                }

            }
            if (!found){
                union.add(num1);
            }
        }

        for (int num2:b) {
            boolean found = false;
            for (int numUnion: union) {
                if(num2 == numUnion) {
                    found = true;
                    break;
                }
            }
            if (!found){
                union.add(num2);
            }
        }
        return union;
    }
    public static void main(String[] args) {
        Bag<Integer> bag1 = new Bag<>();
        Bag<Integer> bag2 = new Bag<>();

        bag1.add(654);
        bag1.add(565);
        bag1.add(67);


        bag2.add(123);
        bag2.add(565);
        bag2.add(67);
        bag2.add(6486);
        bag2.add(67);

        Bag<Integer> union = union(bag1, bag2);

        for (int num: union) {
            System.out.println(num);
        }
/*        System.out.println(bag1.isEmpty());
        System.out.println(bag1.size());



        for (int number : bag1) {
            System.out.println(number);
        }

        System.out.println(bag1.isEmpty());
        System.out.println(bag1.size());*/


    }
}
