import java.util.*;
public class Main {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("Mushroom");
        strings.add("Fire Flower");
        strings.add("SuperStar");
        strings.add("CatBell");
        strings.add("DoubleCherry");
        strings.remove(2);
        Collections.sort(strings);
        System.out.println(strings);
    }
}