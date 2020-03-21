package utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException
    {
      //System.out.println(newFile("deepak.txt"));
    }

    
    public CreateFile() {}
//Create a new file
    public static String getAttachmentPath(String filename) throws IOException {
        //get current project path
    	
    	
        String filePath = "/e2e/uploads/";
        File file = new File(filePath+filename);
        //System.out.println(file);
        FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(createDataSize(32));
		System.out.println(fileWriter.toString());
		fileWriter.flush();
		fileWriter.close();
		return file.getAbsolutePath().toString();
		 	
    	
    }
    
    public static String getScreenshotPath() throws IOException {
        //get current project path
    	
    	
        String filePath = "/e2e/uploads/";
        File file = new File(filePath);
   		return file.getAbsolutePath().toString();
		 	
    	
    }

    
    
    public static String createDataSize(int msgSize) {
        // Java chars are 2 bytes
        msgSize = msgSize * 1024;
        StringBuilder sb = new StringBuilder(msgSize);
        for (int i=0; i<msgSize; i++) {
            sb.append('a');
        }
        return sb.toString();
      }
    }