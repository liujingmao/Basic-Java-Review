package com.cmb.spring;


import com.oracle.tools.packager.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import static com.oracle.tools.packager.IOUtils.*;

public class JavaResourceDemo {
    public static void main(String[] args) throws Exception{

        URL url= new URL("http://www.baidu.com");

        URLConnection urlConnection = url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

       // String con = IoUtil.read (new InputStream(inputStream));

       // System.out.println(con);

    }
}
