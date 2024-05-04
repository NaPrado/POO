package Guias.TP4.Ej12;

public class LinearListImpl implements LinearList{
    private Node first;

    @Override
    public void add(Object obj) {
        Node current=first;
        if(first==null){
            first=new Node(obj,null);
        }else {
            while (current.tail != null) {
                current = current.tail;
            }
            current.tail = new Node(obj, null);
        }
    }

    @Override
    public Object get(int i) {
        return findNode(i).head;
    }

    private Node findNode(int i){
        int j=0;
        Node current=first;
        if(i<0){
            throw new IndexOutOfBoundsException();
        }
        while(j<i && current!=null){
            j++;
            current=current.tail;
        }
        if(current==null){
            throw new IndexOutOfBoundsException();
        }
        return current;
    }

    @Override
    public void set(int i, Object obj) {
        findNode(i).head=obj;
    }

    @Override
    public void remove(int i) {
        if(i < 0 || first==null){
            throw new IndexOutOfBoundsException();
        }
        if(i==0){
            first=first.tail;
        }else{
            Node prevRm = findNode(i-1);
            if(prevRm.tail==null){
                throw new IndexOutOfBoundsException();
            }
            prevRm.tail=prevRm.tail.tail;
        }
    }

    @Override
    public int indexOf(Object obj) {
        int index=0;
        Node current=first;
        while(current!=null && !current.head.equals(obj)){
            current=current.tail;
            index++;
        }
        return current==null?-1:index;
    }

    @Override
    public int size() {
        Node current= first;
        int size=0;
        while(current!=null){
            size++;
            current=current.tail;
        }
        return size;
    }

    private static class Node {

        private Object head;
        private Node tail;
 
        Node(Object head, Node tail) {
            this.head = head;
            this.tail = tail;
        }
 
    } 
}