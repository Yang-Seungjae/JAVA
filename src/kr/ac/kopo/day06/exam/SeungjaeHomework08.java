package kr.ac.kopo.day06.exam;

public class SeungjaeHomework08 {

	public static void main(String[] args) {

		int k = 0, e = 1, f = 2;

		for (int i = 2; i <= 4; i++) {

			for (int j = 1; j <= 9; j++) {
				if (i == 4) {
					System.out.printf("%2d " + " * " + "%2d" + " = " + "%2d" + " ", (i + k), j, j * (i + k));
					System.out.printf("%2d " + " * " + "%2d" + " = " + "%2d" + " \n", (i + e), j, j * (i + e));

				} else {
					System.out.printf("%2d " + " * " + "%2d" + " = " + "%2d" + " ", (i + k), j, j * (i + k));
					System.out.printf("%2d " + " * " + "%2d" + " = " + "%2d" + " ", (i + e), j, j * (i + e));
					System.out.printf("%2d " + " * " + "%2d" + " = " + "%2d" + " \n", (i + f), j, j * (i + f));
				}
			}
			k += 2;
			e += 2;
			f += 2;

		}
	}
}
