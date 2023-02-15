public class Main {
    public static void main(String[] args)
    {
        CircularList lista=new CircularList();

        lista.addNode(
                new Node("A")
        );
        lista.addNode(
                new Node("B")
        );
        lista.addNode(
                new Node("C")
        );
        lista.addNode(
                new Node("D")
        );

        lista.print();
        lista.delete("D");
        System.out.println("***********************");
        lista.print();

    }
}