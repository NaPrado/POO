package Guias.TP5.Ej6;

public class AccessStackTester {

    public static void main(String[] args) {
        AccessStack<Integer> stack = new ArrayAccessStack<>();
        stack.push(2);
        stack.push(3);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.getPushAccesses());
        System.out.println(stack.getPopAccesses());
    }

}

