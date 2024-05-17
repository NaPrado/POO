package Guias.TP6.Ej5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CompositeFunction implements Function{
    List<Function> functions=new ArrayList<>();

    @Override
    public double evaluate(double x) {
        double result = x;
        if (functions.isEmpty()){
            throw new IllegalStateException();
        }
        for (Function f : functions){
            result = f.evaluate(result);
        }
        return result;
    }

    public void addFunction(Function fun) {
        functions.add(fun);
    }
}
