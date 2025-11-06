package oops.interfacee;

import java.util.Scanner;

public class MainMediaPlayable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("Choose your options For Media Player.");
			System.out.println("1. Audio Playeble.");
			System.out.println("2. Video Playble.");

			System.out.println("Enter your option.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				MediaPlayable ap = new AudioPlayer();

				System.out.println("Choose your options For Audio.");
				System.out.println("1. Audio Play");
				System.out.println("2. Audio Pause");
				System.out.println("3. Audio Stop");

				System.out.println("Enter your option.");
				int choice1 = sc.nextInt();

				switch (choice1) {
				case 1:
					ap.play();
					break;
				case 2:
					ap.pause();
					break;
				case 3:
					ap.stop();
					break;
				default:
					System.out.println("Choose Correct operation.");
				}
				break;

			case 2:
				MediaPlayable vp = new VideoPlayer();

				System.out.println("Choose your options For Video.");
				System.out.println("1. Video Play");
				System.out.println("2. Video Pause");
				System.out.println("3. Video Stop");

				System.out.println("Enter your option.");
				int choice2 = sc.nextInt();

				switch (choice2) {
				case 1:
					vp.play();
					break;
				case 2:
					vp.pause();
					break;
				case 3:
					vp.stop();
					break;
				default:
					System.out.println("Choose Correct operation.");
					break;
				}
			default:
				System.out.println("Choose Correct operation.");
			}

		} while (choice < 3);
		sc.close();
	}

}
