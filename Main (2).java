import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("laba.txt"));
            Stack<String> stack = new Stack<>();
            for (String line : lines) {
                if (!line.trim().isEmpty()) { 
                    stack.push(line);
                }
            }
            
             BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
             while (!stack.isEmpty()){
             writer.write(stack.pop() + "\n");
            
             }
             writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
