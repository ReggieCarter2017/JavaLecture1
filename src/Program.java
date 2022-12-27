import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = UserInput();
        int[] creating_array = fillArray(createArray(size));
        printsArray(creating_array);
        print(Count(creating_array));
    }

    static int UserInput()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static int[] createArray(int number)
    {
        int[] array = new int[number];
        return array;
    }

    static int[] fillArray(int[] countArray)
    {
        Random random = new Random();
        for (int i = 0; i < countArray.length; i++)
        {
            countArray[i] = random.nextInt(10);
        }
        return countArray;
    }

    static void printsArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
    static Map<Integer, Integer> Count(int[] array)
    {
        Map<Integer, Integer> howManyTimes = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++)
        {
            int count = 0;

            if (howManyTimes.containsKey(array[i]))
            {
                howManyTimes.put(array[i], howManyTimes.get(array[i]) + 1);
            }
            else
            {
                howManyTimes.put(array[i], 1);
            }
        }
        return howManyTimes;
    }

    static void print(Map<Integer, Integer> myHashMap)
    {
        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet()) {
            System.out.printf("Число: %d встречается: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
