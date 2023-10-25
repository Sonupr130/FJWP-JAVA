package operators;

class Test {

public static void main(String[] args) {

Test1 objTest1 = new Test1();

objTest1.doMethod("test");

}

public void doMethod(String str) {

try {

int i = Integer.parseInt(str);

} catch (NumberFormatException nfe) {

i = 0;

} finally {

System.out.println(i);

}

}

}