import java.text.DecimalFormat;

/**
 * @author ChrisMCodes
 * updated: 2021-05-01
 * 
 * Description: This is just an easy java program to practice the DecimalFormat tool
 *
 */
public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(600, 59));
		System.out.println(getDurationString(601, 59));
		System.out.println(getDurationString(600, -59));
		System.out.println(getDurationString(-600, 59));
		System.out.println(getDurationString(0, 0));
		System.out.println(getDurationString(0, 1));
		System.out.println(getDurationString(1, 0));
		System.out.println(getDurationString(0));
		System.out.println(getDurationString(1));
		System.out.println(getDurationString(-1));
		System.out.println(getDurationString(540));
		System.out.println(getDurationString(5410));
		System.out.println(getDurationString(12));
		
	}

	public static String getDurationString(int minutes, int seconds) {
		DecimalFormat formatter = new DecimalFormat("00");
		if (minutes < 0 || seconds < 0 || seconds > 59) {
			return "Invalid value";
		}
		final int MINUTES_PER_HOUR = 60;
		String hours = formatter.format(minutes / MINUTES_PER_HOUR);
		String mins = formatter.format(minutes % MINUTES_PER_HOUR);
		String secs = formatter.format(seconds);
		
		return hours + "h " + mins + "m " + secs + "s";
	}
	
	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid value";
		}
		
		final int SECONDS_PER_MINUTE = 60;
		int mins = seconds / SECONDS_PER_MINUTE;
		int secs = seconds % SECONDS_PER_MINUTE;
		
		return getDurationString(mins, secs);
	}
}
