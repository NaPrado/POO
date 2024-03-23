package TP2.Ej9;

public class Ej9 {
    public static void main(String[] args) {
        Integer[][] matriz = new Integer[3][4];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = 3 - j + i;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprimimos cada elemento de la matriz
                System.out.print(matriz[i][j] + " ");
            }
            // Al final de cada fila, imprimimos un salto de línea para separar las filas
            System.out.println();
        }
    }
}

