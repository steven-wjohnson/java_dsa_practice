package dev.johnson.steven;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{2, 6, 8, 11, 13, 23, 28, 32, 55, 73, 75};
        int searchNumber = 73;

        int indexFound = BinarySearch.findIntegerInArrayBinary(searchNumber, numbers);

        if(indexFound == -1) {
            System.out.println(String.format("Could not find %d in the source array!", searchNumber));
        }
        else {
            System.out.println(String.format("Found number %d at index %d", searchNumber, indexFound));
        }
    }
}