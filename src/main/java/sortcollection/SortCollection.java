package sortcollection;

import java.util.Collections;
import java.util.List;

public abstract class SortCollection<T> {
   public void sort(List<T> list){
       for (int i = 0; i < list.size() - 1; i++) {
           for (int j = i + 1; j < list.size(); j++) {
               if (compare(list.get(i), list.get(j)) == 1) {
                   Collections.swap(list, i, j);
               }
           }
       }
   }
   abstract int compare(T t1, T t2);
}
