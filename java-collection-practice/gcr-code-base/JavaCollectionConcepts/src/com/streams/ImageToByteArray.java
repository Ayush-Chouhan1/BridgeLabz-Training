package com.streams;
import java.io.*;

public class ImageToByteArray {

    public static void main(String[] args) {

        String inputImage = "1_vGt4ZxCjUhiyeEHFFwkujw.jpg";     
        String outputImage = "outpuImage.jpg";   

        try {

        	    FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println(" Image copied successfully .");

        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
