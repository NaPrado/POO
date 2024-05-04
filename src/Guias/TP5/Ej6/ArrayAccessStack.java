package Guias.TP5.Ej6;

public class ArrayAccessStack<E> extends  ArrayStack<E> implements AccessStack<E>{
    int pushCount=0;
    int popCount=0;
    @Override
    public void push(E o) {
        pushCount++;
        super.push(o);
    }

    @Override
    public E pop() {
        popCount++;
        return super.pop();
    }

    @Override
    public int getPopAccesses() {
        return popCount;
    }

    @Override
    public int getPushAccesses() {
        return pushCount;
    }
}
