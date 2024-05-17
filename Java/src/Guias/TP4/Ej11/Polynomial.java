package Guias.TP4.Ej11;

import static java.lang.Math.pow;

public class Polynomial {
    int grado;
    double []pol;
    Polynomial(int grade) throws InvalidGradeException{
        if(grade<0){
            throw new InvalidGradeException();
        }
        grado=grade+1;
        pol=new double[grado];
    }
    void set(int i, double coef)throws InvalidIndexException{
        if(i<0 || i>grado ){
            throw new InvalidIndexException();
        }
        pol[i]=coef;
    }
    double eval(int grade)throws InvalidIndexException{
        int i=0;
        double ret = 0;
        for(double coefs:pol){
            ret+=coefs*pow(grade,i++);
        }
        return ret;
    }
}
