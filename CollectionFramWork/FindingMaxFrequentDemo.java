import java.io.IOException;

public class FindingMaxFrequentDemo {
    public static void main(String[] args) throws IOException {
        FindingMaximumOccuredWordInEssay obj = new FindingMaximumOccuredWordInEssay();
        String ans = obj.maxFrequentWord("Essay.txt");
        System.out.println(ans);
    }
}
