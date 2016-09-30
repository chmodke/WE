package study.baodian.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kehao on 2016/9/30 16:19.
 * Description：迭代器线程问题
 */
public class Test4_9_2 {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<String>();
        ll.add("first");
        ll.add("second");
        ll.add("thrid");
        ll.add("fourth");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) {
            String str = it.next();
            it.remove();
            System.out.println(str);
            if (str.equals("second")) {
                ll.add("five");
            }
        }
    }
}
