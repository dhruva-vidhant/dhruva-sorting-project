public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        for(int i = 0; i < input.length-1; i++) {
            int minVal = input[i];
            int minIdx = i;
            for(int j = i+1; j<input.length; j++) {
                if(input[j] < minVal) {
                    minVal = input[j];
                    minIdx = j;
                }
            }
            int temp = input[i];
            input[i] = input[minIdx];
            input[minIdx] = temp;
        }
        for(int i : input) System.out.println(i);
    }
}
