package Taller.Taller4.Ej2;

import Taller.Taller4.Ej1.List;

import java.util.Arrays;

public class ArrayIntegerList implements List<Integer>{
    private static final int INITIAL_DIM = 5;
    private Integer[] array = (Integer[]) new Object[INITIAL_DIM];
    private int dim;

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public void add(Integer element) {
        if (dim == array.length){
            resize();
        }
        array[dim++]=element;
    }

    private  void resize(){
        array = Arrays.copyOf(array, array.length + INITIAL_DIM);
    }

    @Override
    public int contains(Integer element) {
        for (int i = 0; i < dim; i++) {
            if (array[i] == element){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= dim){
            return  false;
        }
        System.arraycopy(array, index+1, array, index, dim -index - 1);
        dim--;
        return  true;
    }
}
