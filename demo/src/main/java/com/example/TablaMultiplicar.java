package com.example;

public class TablaMultiplicar {

    public String[] generarTabla(int n) {
        String[] tabla = new String[10];
        for (int i = 1; i <= 10; i++) {
            tabla[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return tabla;
    }
}
