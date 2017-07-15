package com.f0s30n3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileSender sender = new FileSender();
        sender.checkOS();
    }
}
