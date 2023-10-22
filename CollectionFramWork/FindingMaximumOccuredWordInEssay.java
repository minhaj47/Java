import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindingMaximumOccuredWordInEssay {
    String maxFrequentWord(String path) throws IOException {
        Path esseyPath = Path.of(path);
        if(!Files.exists(esseyPath)){
            throw new FileNotFoundException(esseyPath + " doesn't exists");
        }
        String essey = Files.readString(esseyPath);
        String [] words = essey.split("[\\p{Punct}\\s]+");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String word : words){
            if(frequencyMap.containsKey(word)){
                Integer count = frequencyMap.get(word);
                frequencyMap.put(word, count +1);
            }
            else {
                frequencyMap.put(word, 1);
            }
        }
        int maxCount = 0;
        String topWord = "";
        Set<Map.Entry<String, Integer>> entrySet = frequencyMap.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value > maxCount){
                maxCount = value;
                topWord = key;
            }
        }
        return topWord;
    }
}
