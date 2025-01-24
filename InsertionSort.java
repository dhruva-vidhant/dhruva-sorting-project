public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for(int i = 1; i < input.length; i++) {
            int j;
            for(j = 0; j < i; j++) {
                if(input[j] > input[i]) break;
            }
            int next = input[j];
            input[j] = input[i];
            for(int k = j+1; k <= i; k++) {
                int temp = next;
                next = input[k];
                input[k] = temp;
            }
            //for(int x : input) System.out.print(x);
            //System.out.println();
        }
        //for(int i : input) System.out.println(i);
    }
}