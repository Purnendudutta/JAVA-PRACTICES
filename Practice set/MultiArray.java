public class MultiArray {
    public static void main(String[] args) {
       // int[]marks; // 1-D Array
        int[][]flats = new int[2][3]; // 2-D Array
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing 2-D Array");
        for(int i=0;i<flats.length;i++) {
            for(int j=0;j<flats[i].length;j++) {
                System.out.println(flats[i][j]);
               // System.out.println(" ");
            }
           // System.out.println(" ");
        }
    }
}



//       |   0    |   1    |   2
//    0  | (0,0)  | (0,1)  | (0,2)
//    1  | (1,0)  | (1,1)  | (1,2)