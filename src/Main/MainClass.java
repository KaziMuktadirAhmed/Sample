package Main;

import Parser.CppParser;

public class MainClass {
    public static void main(String[] args) {
//        func();
        test();
    }

    public static void func() {
        System.out.println("printing something");
    }

    public static void test() {
        CppParser cppParser = new CppParser("test.cpp");
    }
}

