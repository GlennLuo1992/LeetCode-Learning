package practise2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _16_desCity {
    static public String destCity(List<List<String>> paths){
        String destCity = "";
        List<String> flatList = new ArrayList<>();
        for (List<String> path : paths) {
            flatList.add(path.get(0));
        }
        for (List<String> path : paths) {
            String toPath = path.get(1);
            if (!flatList.contains(toPath)){
                destCity = toPath;
            }
        }
        return destCity;
    }

    public static void main(String[] args) {
        String[][] inputStr = new String[][] {{"B","C"},{"D","B"},{"C","A"}};
        List<List<String>> inputList = new ArrayList<>();
        for (String[] strings : inputStr) {
//          这里涉及到了一个Array与List互转的问题，Array类存在一个静态的转换方法Arrays.asList(strings)
            List<String> l = Arrays.asList(strings);
            inputList.add(l);
        }
        System.out.println(destCity(inputList));
    }
}
