import java.io.*;

// How to write a file using java (4 popular options):-
// FileWriter       = Good for small or medium-sized text files
// BufferedWriter   = Better performance for large amounts of text
// PrintWriter      = Best for structured data, like reports or logs
// FileOutputStream = Best for binary files(e.g., images, audio files)

// How to read a file using java (3 popular options):-
// BufferedReader + FileReader = Best for reading text files line-by-line.
// FileInputStream             = Best for binary files (e.g., images, audio files)
// RandomAccessFile            = Best for read/write specific portions of a large file

public class FileHandling {

    public static void main(String[] args){
//---------------------------------------------------------------------------------------
// WRITE FILE:-
//        String filePath = "C:\\Users\\Leo Aandrew\\Desktop\\test.txt";
//        String textContent = """
//                I like biriyani.
//                It's really good.
//                """;
//
//        try(FileWriter writer = new FileWriter(filePath)){
//            writer.write(textContent);
//            System.out.println("File has been written");
//        }
//
//        catch(FileNotFoundException e){
//            System.out.println("Could not locate file location");
//        }
//        catch(IOException e){
//            System.out.println("Could not write file");
//        }
//----------------------------------------------------------------------------------------
// READ FILE:-
//        String filePath = "C:\\Users\\Leo Aandrew\\Desktop\\test.txt";
//
//        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
//            String line;
//            while((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//        }
//        catch(FileNotFoundException e){
//            System.out.println("Could not locate file!");
//        }
//        catch(IOException e){
//            System.out.println("Something went wrong!");
//        }
//----------------------------------------------------------------------------------------
    }
}
