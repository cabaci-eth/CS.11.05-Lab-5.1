public class ArrayUtility {

    public static void print(int[] array) {
        String result = "";
        for(int i = 0; i<array.length; i++){
            result+=i+", ";
        }
        System.out.println(result.substring(0, result.length()-2));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        return (int)((((double)sum(array)/(double)array.length))*100)/100.00;
    }

    public static void main(String[] args) {
        int[] array = {12,14,9};
        System.out.println(average(array));
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }

        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        return max;
    }

    public static int evenCount(int[] array) {
        int counter = 0;
        for(int i: array){
            if(i%2==0){
                counter++;
            }
        }

        return counter;
    }

    public static int[] reverseOne(int[] array) {
        int[] newArray = new int[array.length];
        for(int i=array.length-1; i>=0; i--){
            newArray[array.length-(i+1)]=array[i];  
        }
        return newArray;
    }

    public static void reverseTwo(int[] array) {
        for(int i=0, j=array.length-1; i<array.length/2; i++, j--){
            int current = array[i];
            array[i]=array[j];
            array[j]=current;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i: array){
            if(i==num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(String s: array){
            if(s.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i=0; i<array.length; i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i=0; i<array.length; i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for(int i: array){
            result+=i+", ";
        }
        return result.substring(0,result.length()-2);
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]+array[j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array){
        int lastElement = array[array.length-1];
        for(int i=array.length-1; i>0; i--){
            array[i]=array[i-1];
        }
        array[0]=lastElement;
    }

    public static void shiftLeft(int[] array) {
        int firstElement = array[0];
        for(int i=0; i<array.length-1; i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftLeft(array);
        }
    }


}
