public class arrayCrossFromX {
    public static void main(String[] args) {
        char sign = 'X';
        char[][] array = new char[7][7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][sign];
                System.out.println(array[i][j]);
            }
        }
    }
}
