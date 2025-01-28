public class ShiftOperators {
    public static void main(String[] args) {
        int num = 16;
        // Left shift operator
        int leftShift = num << 2;
        System.out.println("Left shift = " + leftShift);
        // Right shift operator
        int rightShift = num >> 2;
        System.out.println("Right shift =" + rightShift);
        // Unsigned right shift operator
        int unsignedRightShift = -16 >>> 2;
        System.out.println("Unsigned right shift = " + unsignedRightShift);
    }
}