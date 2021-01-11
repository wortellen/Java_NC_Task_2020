package ru.ncedu.wortellen.InterfacesAndLambdaExpressions;

import java.text.Collator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

import java.util.Collections;

public class Ex13 {
    public static void main(String[] args) {
        File dir = new File("D:\\!Wort\\Documents");
        List<File>files = new ArrayList<>(Arrays.asList(Objects.requireNonNull(dir.listFiles())));

        files.sort(( o1, o2) -> {
            if (o1.isDirectory() && o2.isDirectory())
                return o1.getName().toLowerCase(Locale.ROOT).compareTo(o2.getName().toLowerCase(Locale.ROOT));
            else if (o1.isDirectory())
                return -1;
            else if (o2.isDirectory()) return 1;
            else return o1.getName().toLowerCase(Locale.ROOT).compareTo(o2.getName().toLowerCase(Locale.ROOT));
        });
        for(File i:files){
            System.out.println(i.getName());
        }
    }
}
