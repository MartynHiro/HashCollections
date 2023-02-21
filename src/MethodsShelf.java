import java.util.Map;

public class MethodsShelf {
    public static void fillingMap(String text, Map<Character, Integer> map) {
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            //достаем символ и если он буква, то смотрим в нашу мапу
            if (Character.isLetter(symbol)) {
                symbol = Character.toLowerCase(symbol); //приводим буквы к одному регистру

                if (map.containsKey(symbol)) {  //если он уже есть в ней, то добавляем +1 к счётчику
                    int counter = map.get(symbol);
                    map.put(symbol, (counter + 1));
                } else {           //если впервые этот символ встречаем, то добавляем его в мапу со счётчиком 1
                    map.put(symbol, 1);
                }
            }
        }
    }
public static String frequencyDetection(Map<Character, Integer> map) {
    //ищем самый часто/редко используемый символ
    char mostFrequentSymbol = 0;
    int maxCount = 0;

    char theRarestSymbol = 0;
    int minCount = 0;

    for (Map.Entry<Character, Integer> kv : map.entrySet()) { //проходимся по каждому значению в нашей мапе
        char currentSymbol = kv.getKey();
        int currentCount = kv.getValue();

        if (maxCount == 0) { //если это наша первая проходка, то добавляем нашу первую пару и частый и в редкий символ
            mostFrequentSymbol = currentSymbol;
            maxCount = currentCount;

            theRarestSymbol = currentSymbol;
            minCount = currentCount;
        }

        if (currentCount > maxCount) {  //сохраняем самую частую букву
            mostFrequentSymbol = currentSymbol;
            maxCount = currentCount;
        }

        if (currentCount < minCount) { //сохраняем самую редкую букву
            theRarestSymbol = currentSymbol;
            minCount = currentCount;
        }
    }
    return "Самая частая буква - " + mostFrequentSymbol + " использовалась " + maxCount + " раз " +
            "\nСамая редкая буква - " + theRarestSymbol + " использовалась " + minCount + " раз";

    }
}
