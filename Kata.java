import java.util.*;
public class Kata {
    public static void main(String[] args) {
        long ip = 2154959208L;
        ArrayList<Long> nums = new ArrayList<>();
        long bin;
        String bigBin;
        StringBuilder sb = new StringBuilder();
        int[] bytes = new int[4];
        String finishedProduct = "";

        // convert ip to binary
        while (ip != 0) {
            bin = ip % 2;
            nums.add(bin);
            ip = ip / 2;
        }

        // build new string
        for (int i = 0; i < nums.size(); i++) {
            sb.append(nums.get(i));
        }

        bigBin = sb.toString();

        StringBuilder completeBin = new StringBuilder();
        for (int i = bigBin.length() - 1; i >= 0; i--) {
            completeBin.append(bigBin.charAt(i));
        }

        bigBin = completeBin.toString();
        int count = 0;
        for (int i = 0; i < bytes.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                temp.append(bigBin.charAt(j + (8 * count)));
            }
            count++;
            bytes[i] = Integer.parseInt(temp.toString());
        }

        // translate each byte to decimal and
        // concatenate each byte to string, separated by "."
        for (int i = 0; i < bytes.length; i++) {
            int num = bytes[i];
            int dec_value = 0;
            int base = 1;
            int temp = num;

            while (temp > 0) {
                int last_digit = temp % 10;
                temp = temp / 10;
                dec_value += last_digit * base;
                base = base * 2;
            }

            finishedProduct = finishedProduct + dec_value;
            if (i != bytes.length - 1) { finishedProduct += "."; }

        }

        System.out.println(finishedProduct);
    }
}

