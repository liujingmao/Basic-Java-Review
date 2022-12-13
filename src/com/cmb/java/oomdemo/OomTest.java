package com.cmb.java.oomdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Comman Oom Demo Test
 * Learn How to Analyze Oom of Program
 * 1. Program
 * 2. Use Default VM Parameter,will spend long time to
 *    exec it,so set vm parameter smaller,as flowing
 *    -ea -Xmx5m -XX:+HeapDumpOnOutOfMemoryError
 *    -XX:HeapDumpPath=/Users/liujingmao/Downloads/JavaBasic/untitled/src/com/cmb/java/heap.hprof
 * 3. start the program
 * 4. get java program's proesss ID using 'jps' this command
 * 5. generate dump file using the comman as flowing
 *     jmap -dump:format=b,file=./thisdump.hprof 61071(pid)
 * 6. Analize the dump filw with Mat Tool by import thisdump.hprof
 * 7. Detail Analysis
 */

public class OomTest {
    public static void main(String[] args) throws InterruptedException {

       new Thread(new Runnable() {
           @Override
           public void run() {
               List<OomTest> list = new ArrayList<>();
               while (true){
                   list.add(new OomTest());
               }
           }
       }).start();

       while (true){
           TimeUnit.SECONDS.sleep(0x3);
       }
    }
}
