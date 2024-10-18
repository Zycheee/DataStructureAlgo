public class Main {
    public static void main(String[] args) {
        NodeList stack = new NodeList();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        stack.add("E");

        stack.displayInfo();
        stack.remove(3);
        stack.displayInfo();

    }
}