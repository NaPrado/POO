package Guias.TP5.Ej3.P1;

public class LinearListImpl<T> implements LinearList<T> {
    private Node<T> first;

    @Override
    public void add(T obj) {
        Node<T> current=first;
        if(first==null){
            first= new Node<T>(obj, null);
        }else {
            while (current.tail != null) {
                current = current.tail;
            }
            current.tail = new Node<T>(obj, null);
        }
    }

    @Override
    public T get(int i) {
        return findNode(i).head;
    }

    private Node<T> findNode(int i){
        int j=0;
        Node<T> current=first;
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
    public void set(int i, T obj) {
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
            Node<T> prevRm = findNode(i-1);
            if(prevRm.tail==null){
                throw new IndexOutOfBoundsException();
            }
            prevRm.tail=prevRm.tail.tail;
        }
    }

    @Override
    public int indexOf(T obj) {
        int index=0;
        Node<T> current=first;
        while(current!=null && !current.head.equals(obj)){
            current=current.tail;
            index++;
        }
        return current==null?-1:index;
    }

    @Override
    public int size() {
        Node<T> current= first;
        int size=0;
        while(current!=null){
            size++;
            current=current.tail;
        }
        return size;
    }

    private static class Node<T>{

        private T head;
        private Node<T> tail;
 
        Node(T head, Node<T> tail) {
            this.head = head;
            this.tail = tail;
        }
 
    } 
}
