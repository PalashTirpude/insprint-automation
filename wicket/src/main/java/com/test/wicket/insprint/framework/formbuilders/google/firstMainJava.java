package com.test.wicket.insprint.framework.formbuilders.google;

import java.io.*;

public class firstMainJava {
    public static void main(String[] args) throws IOException {
    System.out.println("Hello");
        InputStream in = new FileInputStream("./.pkg/company/companies.json");
        System.out.println(in.available());
        File file=new File("./.pkg/testTextFiles/test.txt");
        FileInputStream fis= new FileInputStream(file);
        System.out.println(String.format("FileDescription --> %s",fis.getFD().toString()));
    }
}
