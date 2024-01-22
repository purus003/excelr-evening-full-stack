class D {
    public static void main(String[] args) {
        int[][][] x = { {{10, 20}, {30, 40, 50, 60}, {70, 80, 90}} };

        for (int[][] rowArray : x) {
            for (int[] colArray : rowArray) {
                for (int element : colArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}