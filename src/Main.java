import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\s
                et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\s
                consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\s
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.""";

        Map<Character, Integer> map = new HashMap<>();

        MethodsShelf.fillingMap(text, map);

        MethodsShelf.frequencyDetection(map);
    }

}