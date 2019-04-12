package com.Tarasov.L11.tasks;

import sun.text.normalizer.UTF16;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task4 {
    public static void task4(){
        List<String> list = new ArrayList<>();
        list.add("a1");list.add("a4");list.add("a3");list.add("a2");list.add("a1");list.add("a4");list.add("b1");list.add("b2");
        System.out.println(list.stream().anyMatch(s->s.equals("a1")));
        System.out.println(list.stream().allMatch(s -> s.contains("a")));
        System.out.println(list.stream().allMatch(s -> !s.equals("a7")));
       //list.stream().forEach(s ->  new StringBuilder(s).append("1"));
       list.stream().forEach(s-> System.out.println(s.concat("1")));
      // list.stream().forEach(s -> s.substring(1));
      List<Integer> list1 =  list.stream().map(s -> s.substring(1)).mapToInt(s -> (Integer.parseInt(s))).boxed().collect(Collectors.toList());
        System.out.println();
      System.out.println(list1);

      String encodeStr = Base64.getEncoder().encodeToString("Password".getBytes(StandardCharsets.UTF_8));
        System.out.println(encodeStr);
        byte[] decodeStr = Base64.getDecoder().decode("UGFzc3dvcmQ=".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(decodeStr, StandardCharsets.UTF_8));

    }


    public Integer calc(String str)
    {
        return Integer.parseInt(str);
    }

}
