public class CircularList {

    private Node head;

    public void addNode(Node node){

        if(head==null){
            head=node;
            head.setNext(head);
            head.setPrev(head);
        }else{

            Node tail=head.getPrev();
            node.setNext(head);
            head.setPrev(node);
            tail.setNext(node);
            node.setPrev(tail);

        }
    }

    public void delete(String goal){
        if (head==null){
            System.out.println("Empty List");
        }else if(head==head.getNext()){
            head=null;
        }
        delete(head, goal);
    }

    private void delete(Node current, String goal){


        if(current.getName().equals(goal)){

            if(current==head){
                Node next=head.getNext();
                next.setPrev(null);
                head=next;
                return;
            }
            else{

            }

            Node prev=current.getPrev();
            Node next=current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
            return;
        }
        delete(current.getNext(), goal);

    }



    public void print(){

        if(head==null){
            System.out.println("Lista Vacia");
        }else{
            print(head);
        }

    }

    private void print(Node current){

        if(current==head.getPrev()){
            System.out.println(current.getName());
            return;
        }
        System.out.println(current.getName());
        print(current.getNext());
    }
}
