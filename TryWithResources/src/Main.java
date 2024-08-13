import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

 class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + filePath);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        List<String> filePaths = List.of("D:\\java prac\\Assignement 9\\TryWithResources\\src\\file1.txt","D:\\java prac\\Assignement 9\\TryWithResources\\src\\file2.txt");
        processor.processFiles(filePaths);
    }
}
