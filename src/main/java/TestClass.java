package main.java;

import java.util.*;

public class TestClass {
    String test="test";
    String test2="test2";
    String test3="test3";


    private static Map<Character, Integer> map = new HashMap<>();
    private static ArrayList<Character> characters = new ArrayList<>();
    private static ArrayList<Integer> integers = new ArrayList<>();
    private static A a=new A();
    private static HelloRunnable helloRunnable = new HelloRunnable();
    private static HelloRunnableTwo helloRunnableTwo = new HelloRunnableTwo();

    //static {
    //    a=new A();
    //}


    private static Integer getInteger(Character input) {
        if (input=='a') {
            return 1;
        } else if (input=='b') {
            return 2;
        }
        return 0;
    }

    private static Integer getIntegerTwo(Character input) {
        if (input=='a') {
            return 3;
        } else if (input=='b') {
            return 4;
        }
        return 5;
    }

    private void addToList(Character c) {
        characters.add(c);
    }

    public static void main(String[] args) {

        //private static A a=new A();
        characters.add('a');
        //characters.add('a');
        characters.add('b');
        //characters.add('b');
        characters.add('c');

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        //a=new A();

        for (int i=0;i<3;i++) {
            map.computeIfAbsent(characters.get(i), key -> getInteger(key));

        }

        for (Character c : map.keySet()) {
            System.out.println(map.get(c));
        }

        characters.add('d');

        for (int i=0;i<4;i++) {
            map.computeIfPresent(characters.get(i), (key,value) -> value+1);

        }



        System.out.println("");

        for (Character c : map.keySet()) {
            System.out.println(map.get(c));
        }

        Optional<Character> opC = Optional.ofNullable('c');
        

        a = new A();

        opC.ifPresent(a::setC);

        opC.ifPresent(value -> {
            String s=value + "b";
            a.setS(s);
        });

        //new Thread()

        //helloRunnable.run();
        //helloRunnableTwo.run();
        //(new Thread(new HelloRunnable())).start();
        //(new Thread(new HelloRunnableTwo())).start();
        //new Thread()
       // new HelloThread().start();
        //new HelloThreadTwo().start();

        List<String> names = Arrays.asList("andreas","gustav","gustaf","alexander");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (String name : names) {
            System.out.println(name);
        }

        Integer a = 0;
        Integer b = 1;

        System.out.println(a < b ? a : b);


    }

    private static class A {

        private Character c;
        private String s;

        public void setC(Character c) {
            this.c = c;
        }

        public void setOpC(Optional<Character> opC) {
            opC.ifPresent(this::setC);
        }

        public void setS(String s) {
            this.s=s;
        }
    }

}

