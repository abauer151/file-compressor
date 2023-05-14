import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Encode
{
    public static byte[] encode(File input) throws IOException
    {
        //Count the occurrences of each character in text file
        Map<Character, Integer> counts = Encode.count(input);

        //Build Huffman Tree from counts
        HuffmanTree huffmanTree = new HuffmanTree(counts);

        //Map each character to an encoding

        //Use Huffman Tree encodings to turn text file into binary


        return null;
    }

    public static Map<Character, Integer> count(File input) throws IOException
    {
        //count occurrences of each character in file
        Map<Character, Integer> counts = new HashMap<>();

        Scanner scanner = new Scanner(new File("input.txt"));
        scanner.useDelimiter("");
        while(scanner.hasNext() || scanner.hasNextLine())
        {
            Character next = scanner.next().charAt(0);
            if(counts.containsKey(next))
                counts.put(next, counts.get(next) + 1);
            else
            {
                counts.put(next, 1);
            }
        }
        return counts;
    }
}