package array;
import java.util.Arrays;

class arraycopy {
    public static void main(String[] args) {
      
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) { 
            //using looping construct to copy the elements
            destination[i] = source[i];
        }
      
         // converting array to string by []and ,
        System.out.println(Arrays.toString(destination));
    }
}
