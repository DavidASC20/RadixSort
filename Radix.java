public class Radix {
    public static int nth(int n, int col){
        int x = Math.abs(n);
        int b = n / (int)Math.pow(10, col - 1) % 10;
        return b -1;
    }

    public static int length(int n){
        int x = Math.abs(n);
        if(x == 0){
            return 1;
        }else{
            return (int) Math.log10(x) + 1;
        }
    }

    public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
        for (int i=0; i<buckets.length; i++) {
        original.extend(buckets[i]);
        }
    }

    public static void radixSortSimple(SortableLinkedList data){

    }

    public static void radixSort(SortableLinkedList data){
        
    }
}
