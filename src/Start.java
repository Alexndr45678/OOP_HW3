public class Start {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();

        integerMyList.add(4);
        integerMyList.add(4);
        integerMyList.add(5);
        integerMyList.add(2);
        integerMyList.add(1);
        integerMyList.print();

        System.out.println("___________________");

        integerMyList.remove(5);
        integerMyList.print();
    }
}
