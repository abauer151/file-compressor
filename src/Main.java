import java.io.*;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        File input = new File("/Users/aidanbauer/eclipse-workspace/file-compressor/repetitive.txt");
        File compressed = new File("/Users/aidanbauer/Desktop/compressed.txt");
        File output = new File("output.txt");

        FileCompressor.encode(input, "compressed");
        FileCompressor.decode(compressed, output);
    }

}
