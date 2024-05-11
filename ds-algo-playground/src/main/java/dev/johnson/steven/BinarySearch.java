package dev.johnson.steven;

public class BinarySearch {
    
    public static int findIntegerInArrayLinear(Integer number, Integer[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            if(sourceArray[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int findIntegerInArrayBinary(Integer number, Integer[] sourceArray) {
        int left = 0;
        int right = sourceArray.length - 1;
        int currentIndex = left + (right - left) / 2;
        
        while(left <= right) {
            System.out.println(String.format("\n left: %d \n right: %d \n current: %d", left, right, currentIndex));

            if(sourceArray[currentIndex] == number) {
                return currentIndex;
            }
            else if(number < sourceArray[currentIndex]) {
                right = currentIndex - 1;
                currentIndex = left + (right - left) / 2;
            }
            else {
                left = currentIndex + 1;
                currentIndex = left + (right - left) / 2;
            }
        }

        return -1;
    }
}
