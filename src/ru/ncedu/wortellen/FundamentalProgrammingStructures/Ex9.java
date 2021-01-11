package ru.ncedu.wortellen.FundamentalProgrammingStructures;

public class Ex9 {
    public static void main(String[] args) {
        //пример из лекции
        //создаем строку обычным способом, она попадает в string pool
        //вторую создаем через new, из-за этого в string pool'е появляется такая же строка
        //таким образом оба указателя будут указывать на разные строки
        String s = "NetCracker";
        String t = new String("NetCracker");
        System.out.println(s==t);
        System.out.println(s.equals(t));
    }
}
