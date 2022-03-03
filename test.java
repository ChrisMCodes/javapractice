import java.util.Scanner;

class test {

    public static void main(String[] args) {

        String name = ""; // blank string for error handling
        int age = -1; // negative age for error handling

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        name = getName(name, "your name", sc);

        System.out.println("It's nice to meet you, " + name);

        age = getAge(age, sc);

        System.out.println("Nice! You were born in " + (2021 - age) + " or " + (2022 - age));

        sc.close();

    }

    /*
     *
     * Purpose: checks for blank string input
     * 
     * @Params: String strToCheck (the string being checked)
     * String prompt (The prompt used to get string info from user)
     * Scanner sc (Scanner util)
     * 
     */
    public static String getName(String strToCheck, String prompt, Scanner sc) {
        while (strToCheck.trim().isEmpty()) {
            strToCheck = sc.nextLine();
            if (strToCheck.trim().isEmpty()) {
                System.out.println("Whoops! I didn't get that. Please enter " + prompt + " again.");
                strToCheck = "";
            }
        }
        return strToCheck;
    }

    /*
     *
     * Purpose: checks for illogical age input
     * 
     * @Params: int age (being checked)
     * Scanner sc (Scanner util)
     * 
     */

    public static int getAge(int age, Scanner sc) {
        try {
            while (age < 0 || age > 130) {
                System.out.println("Please enter your age: ");
                age = sc.nextInt();

                if (age < 0 || age > 130) {
                    System.out.println("Hmmm, that age doesn't look right. Please enter your age again.");
                }
            }
        } catch (Exception e) {
            // catches type errors
            age = 0;
            System.out.println("Sorry, an error occurred");
            System.out.println("Program is exiting.");
            System.exit(0);
        }
        return age;
    }
}