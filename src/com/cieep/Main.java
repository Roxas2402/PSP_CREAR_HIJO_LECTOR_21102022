package com.cieep;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ficheroNombre = sc.nextLine();

        File fichero = new File(ficheroNombre);

        if (fichero.exists()) {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } else {
            throw new FileNotFoundException();
        }
    }
}