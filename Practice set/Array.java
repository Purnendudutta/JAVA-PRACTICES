public class Array {
    public static void main(String[] args) {
//        int [] marks;
//        marks = new int[5];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 50;
//        System.out.println(marks[1] + "," +  marks[3]);

        int[]marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
//        System.out.println(marks[1] + "," +  marks[3]);

//        int[]marks = {10,20,30,40,50};
//        System.out.println(marks[1] +"," + marks[3]);
    
//        float[]marks = {89.4f, 23.7f,78.9f,90.45f,78f};
//        System.out.println(marks[4]);
//        System.out.println(marks.length);

//        String[]name = {"Rohan","Rakesh","Ravi","Ratan","Ritika"};
//        System.out.println(name[3]);

//        for(int i=0; i<marks.length; i++) {
//            System.out.println(marks[i]); //increment order
//        }

//        for(int i=marks.length-1; i>=0; i--) {
//            System.out.println(marks[i]); //Decrement order
//        }

        System.out.println("Printing using for-each loop");
        for(int element:marks) {
            System.out.println(element);
        }

}
}
