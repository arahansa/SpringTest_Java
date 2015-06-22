package betaspring.collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by arahansa on 15. 6. 22.
 */
public class Lists {

    public static void main(String[] args) {
        String[] ganzi12 = new String[]{
                "쥐", "소", "호랑이", "토끼",
                "용", "뱀", "말", "양",
                "원숭이", "닭", "개", "돼지"
        };
        List<String> list = Arrays.asList(ganzi12);
        showList("그냥 리스트",list);
        ArrayList<String> listArray = new ArrayList<>();
        listArray.addAll(list);
        showList("어레이리스트",listArray);
        LinkedList<String> listLinked = new LinkedList<>();
        listLinked.addAll(list);

        showList("링크드리스트", listLinked);

    }
    public static void showList(String msg, List<?> list){
        System.out.print(msg+" : ");
        list.forEach(x-> System.out.print(x + " "));
        System.out.println();
    }
}
