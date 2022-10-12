package Recursion;

import java.io.File;

public class FindMyFile {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir"); // user.dir means path to project root
        findFiles("Algorithm&DataStructure.iml",projectPath);
    }
    public static void findFiles(String fileName, String inputPath ){
        File directory = new File(inputPath);
        if(directory.isDirectory()){
            File [] fileList = directory.listFiles();
            for(File file : fileList){
                if(file.isDirectory()){
                    findFiles(fileName,file.getAbsolutePath());
                }else if(fileName.equals(file.getName())){
                    System.out.println(inputPath+"/"+fileName+" found");
                }
            }
        }
    }
}
