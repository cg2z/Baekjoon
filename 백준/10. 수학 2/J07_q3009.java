import java.util.Scanner;

public class J07_q3009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x[] = new int[3];
		int y[] = new int[3];
		for (int i = 0; i < 3; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		int resultX = 0, resultY = 0;

		if (x[0] == x[1])
			resultX = x[2];
		else if (x[0] == x[2])
			resultX = x[1];
		else
			resultX = x[0];

		if (y[0] == y[1])
			resultY = y[2];
		else if (y[0] == y[2])
			resultY = y[1];
		else
			resultY = y[0];

		System.out.println(resultX + " " + resultY);
	}
}
