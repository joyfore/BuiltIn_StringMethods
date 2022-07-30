class BuiltIn_StringMethods {
    public static void main(String[] args) {
        String s = "Strings are immutable";
        s = s.concat(" all the time");
        System.out.println(s);

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2));

        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));
        System.out.println(myStr.contains("e"));
        System.out.println(myStr.contains("Hi"));

        String myStr3 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr3.indexOf("planet"));
    }
}