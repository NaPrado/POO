package Taller.Taller7.Ej2;

@FunctionalInterface
public interface Mapper<ValueIn, ValueOut>{
    ValueOut map(ValueIn valueIn);
}
