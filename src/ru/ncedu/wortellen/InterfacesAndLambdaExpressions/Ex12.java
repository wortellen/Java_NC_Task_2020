package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Objects;

public class Ex12 {
    public static void main(String[] args) {
        File dir = new File("D:\\!Wort\\Documents");
        String[] test = dir.list((dir1, name) -> name.length()==5);

        assert test != null;
        for(String item : test){
            System.out.println(item);
        }
    }
}
