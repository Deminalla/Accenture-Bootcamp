import java.io.File;
import java.util.ArrayList;

public class fileList {
    public static void main (String[] args){
        // get a list of all file/directory names from the given
        File files = new File("C:\\Users\\deniz\\Desktop\\Accenture");
        String[] fList = files.list();

        ArrayList<String> fileNames = new ArrayList<>();
        for(String name: fList){
            System.out.println(name);
            fileNames.add(name);
        }

        System.out.println("Files ending with .pdf:");
        for(String name: fList) {
            if (name.endsWith(".pdf")){
                System.out.println(name);
            }
        }

        if(files.exists()){ // check if a file or directory specified by pathname exists or not
            System.out.println("The directory/file " + files + " exists");
        }
        else{
            System.out.println("The directory/file " + files + " does not exist");
        }

        // check if a file or directory has read and write permission
        if (files.canWrite()) {
            System.out.println(files.getAbsolutePath() + " can write");
        }
        else {
            System.out.println(files.getAbsolutePath() + " cannot write");
        }
        if (files.canRead()) {
            System.out.println(files.getAbsolutePath() + " can read");
        }
        else {
            System.out.println(files.getAbsolutePath() + " cannot read");
        }

        // check if given pathname is a directory or a file
        if (files.isFile()){
            System.out.println(files.getAbsolutePath() + " is a file");
        }
        else if (files.isDirectory()){
            System.out.println(files.getAbsolutePath() + " is a directory");
        }

        //compare 2 files lexicographically
        String fileName1 = fileNames.get(2);
        String fileName2 = fileNames.get(5);
        System.out.println(fileName1 + " and " + fileName2 + ": " + fileName1.compareTo(fileName2)); // it compares the 1st different symbol according to the same index
        /*
        if s1 > s2, it returns positive number
        if s1 < s2, it returns negative number
        if s1 == s2, it returns 0
        for example hello compared to hemlo is -1 because "l" is 1 times lower than "m"
         */
    }
}
