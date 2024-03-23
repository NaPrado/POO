package TP2.Ej5;

public class IsPalindromo {
    public static void main(String[] args) {
        StringBuilder frase = new StringBuilder();
        for (String s : args) {
            frase.append(s.toLowerCase());
        }
        if (esPalindromo(frase.toString())){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }
    }
    private static boolean esPalindromo(String palabra){
        for (int i = 0;i<palabra.length()/2;i++){
            if (palabra.charAt(i)!=palabra.charAt(palabra.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
