package caughtSpeeding;

public class Speeding {
	
	public static void main(String[] args)
	{
		System.out.print(caughtSpeeding(60, false)); // should return 0
		System.out.print(caughtSpeeding(65, false)); // should return 1
		System.out.print(caughtSpeeding(65, true)); // should return 0
	}
	
	public static int caughtSpeeding(int speed, boolean isBirthday)
	{
		if (isBirthday == false) {
			if (speed <= 60) {
				return 0;
			}
			if (speed >= 61 && speed <= 80) {
				return 1;
			}
			if (speed >= 81) {
				return 2;
			}
		} else {
			if (speed <= 65) {
				return 0;
			}
			if (speed >= 66 && speed <= 85) {
				return 1;
			}
			if (speed >= 86) {
				return 2;
			}
		}
		//this is for errors
		return 0000000000000000000000;
	}
}
