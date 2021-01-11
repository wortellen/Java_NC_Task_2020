package ru.ncedu.wortellen.JavaTaskCollectionsPart1;

public class IncorrectIndexException extends Exception{
    @Override
    public String toString() {
        return "Error. INDEX>SIZE0";
    }
}