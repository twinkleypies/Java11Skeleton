class TwoArrays {
    public static void main(String[] args) {
        int[] val = { 13, -4, 82, 17 };
        //sets value for val
        int[] twice = {val[0]*2, val[1]*2, val[2]*3, val[3]*2};
        //sets value for twice

        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        // Construct an array object for twice.

        // Put values in twice that are twice the
        // corresponding values in val.

        System.out.println("New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
        //prints out the different values
    }
}