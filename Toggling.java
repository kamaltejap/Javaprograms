import java.util.Scanner;

public class Toggling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three decimal numbers from the user
        System.out.print("Enter the first decimal number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second decimal number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third decimal number: ");
        int num3 = scanner.nextInt();

        // Convert the numbers to binary strings
        String binary1 = Integer.toBinaryString(num1);
        String binary2 = Integer.toBinaryString(num2);
        String binary3 = Integer.toBinaryString(num3);

        // Pad the binary strings with leading zeros to make them of equal length
        int maxLength = Math.max(Math.max(binary1.length(), binary2.length()), binary3.length());
        binary1 = String.format("%" + maxLength + "s", binary1).replace(' ', '0');
        binary2 = String.format("%" + maxLength + "s", binary2).replace(' ', '0');
        binary3 = String.format("%" + maxLength + "s", binary3).replace(' ', '0');

        // Perform the XOR operation on the binary strings
        String xorResult = "";
        for (int i = 0; i < maxLength; i++)
        {
            xorResult += (binary1.charAt(i) == binary2.charAt(i)) ? '0' : '1';
        }

        // Count the number of bits to be toggled to match the XOR result with the third number
        int toggleCount = 0;
        for (int i = 0; i < maxLength; i++) {
            if (xorResult.charAt(i) != binary3.charAt(i)) {
                toggleCount++;
            }
        }

        System.out.println("Number of bits to be toggled: " + toggleCount);

        scanner.close();
    }
}