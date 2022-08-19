import java.io.File;
import java.io.FilenameFilter;

public class fileList {
    public static void main (String[] args){
        // get a list of all file/directory names from the given
        File files = new File("C:\\Users\\deniz\\Desktop\\Accenture");
        String[] fList = files.list();
        for(String name: fList){
            System.out.println(name);
        }

        //get specific files by extensions from a specified folder
        System.out.println("Files ending with .pdf:");
        for(String name: fList) {
            if (name.endsWith(".pdf")){
                System.out.println(name);
            }
        }
    }

    }
