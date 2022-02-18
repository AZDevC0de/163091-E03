package com.company;

import java.io.File;

public class Main {
    public static void main(String[]args) {
        String[] files = filesWithoutExt("C:/Users/Angela/Desktop/My_repository/GitHub/163091-E03 ",".iml");
        for(String f: files){
            System.out.println(f);
        }
    }
    public static String[] filesWithoutExt(String path,String ext) {
        File folder = new File(path);
        return folder.list(((dir, name) -> !name.contains(ext)));
	// write your code here
    }
}
