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
            int nums=0;
            for (int i=0;i< data.size();i++){
              if (nums<data.get(i)){
                nums=data.get(i);
        
              }
            }
            int i =0;
            SortableLinkedList buckets[]=new SortableLinkedList[10];
            for (int b=0;b<buckets.length;b++){
              buckets[b]=new SortableLinkedList();
            }
            while (i<length(nums)){
               while (data.size()>0){
                 int x=data.remove(0);
                int index= nth(x,i);
                buckets[index].add(x);
               }
               merge(data,buckets);
                  i++;
            }
          }
    

    public static void radixSort(SortableLinkedList data){
        
    }
}
