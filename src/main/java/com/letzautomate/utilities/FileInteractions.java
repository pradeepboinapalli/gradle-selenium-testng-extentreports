package com.letzautomate.utilities;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileInteractions {

    public void createFolder(String folderPath) throws IOException {
        File file=new File(folderPath);
        if(file.getAbsoluteFile().exists()){
            FileUtils.forceDelete(file);
            file.mkdir();
            return;

        }

    }

    public void createFolderIfNotExists(String folderPath){
        File file=new File(folderPath);
        if(!file.getAbsoluteFile().exists()){
            file.mkdir();
            return;
        }

    }

    public void deleteFolder(String folderPath) throws IOException {
        File file=new File(folderPath);
        if(file.getAbsoluteFile().exists()){
            FileUtils.forceDelete(file);
            return;
        }
    }

    public void createFileAndWrite(String filePath,String content) throws IOException {
        File file =new File(filePath);
        if(file.getAbsoluteFile().exists()){
            FileUtils.forceDelete(file);
        }
        file.getAbsoluteFile().createNewFile();
        FileWriter fileWriter=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();

    }

    public void createFile(String filePath) throws IOException {
        File file=new File(filePath);
        if(file.exists()){
            FileUtils.forceDelete(file);

        }
        file.getAbsoluteFile().createNewFile();
    }


}
