package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

import java.io.File;
import java.io.FileFilter;
import java.util.Objects;

public class Ex11 {
    public static void main(String[] args) {
        anonFunc();
        lambda();
    }

    public static void anonFunc() {
        File dir = new File("C:\\Program Files");
        if(dir.isDirectory())
        {
            for(File item : Objects.requireNonNull(dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().length()==3;
                }
            }))){
                if(item.isDirectory()){
                    System.out.println(item.getName());
                }
            }
        }
    }

    public static void lambda() {
        File dir = new File("C:\\Program Files");
        if(dir.isDirectory())
        {
            for(File item : Objects.requireNonNull(dir.listFiles(pathname -> pathname.getName().length()==3))){
                if(item.isDirectory()){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
