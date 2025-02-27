public class Average {
    public static void main(String[] args) {
        float[]marks = {34.5f,56.5f,23.5f,67.5f,50.0f};
        float sum = 0;
        for(float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value of average marks is: " + sum/marks.length);
    }
}
