public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for(int i = 1; i < input.length-1; i++) {
            int minVal = input[i];
            int minIdx = i;
            for(int j = i+1; j < input.length; j++) {
                if(input[j] < minVal) {
                    minVal = input[j];
                    minIdx = j;
                }
            }
            int j;
            for(j = 0; i < i; j++) {
                if(input[i] > minVal) break;
            }
            int temp = input[j];
            input[j] = minVal;
            for(int k = j; k < minIdx; k++) {
                
            }
        }
        for(int i : input) System.out.println(i);
    }
}
