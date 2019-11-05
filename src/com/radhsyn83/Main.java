package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Koordinat kdt1 = new Koordinat(2, 10, 5, 7);
        Koordinat kdt2 = new Koordinat(5, 1, 3, 12);

        System.out.println("Garis yang melalui titik (2,10) dan titik (5,7) memiliki gradien sebesar "
                + kdt1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan titik (3,12) memiliki gradien sebesar "
                + kdt2.hitungGradien());
    }
}
