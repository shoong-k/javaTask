package _0723;

public class Main {
    public static void main(String[] args) {
        String[] strings2 = null;
        String s = printPretty(strings2);
        System.out.println(s);

        String[] strings = new String[0];
        System.out.println(printPretty(strings));

        String[] strings1 = new String[1];
        System.out.println(printPretty(strings1));

        strings1[0] = "pretty";
        System.out.println(printPretty(strings1));

        String[] strings3 = new String[2];
        System.out.println(printPretty(strings3));

        strings3[1] = "p";
        System.out.println(printPretty(strings3));

        String[] strings4 = new String[3];
        System.out.println(printPretty(strings4));

        strings4[0] = "c";
        strings4[1] = "a";
        strings4[2] = "t";
        System.out.println(printPretty(strings4));
    }

    public static String printPretty(String[] strings) {
        if (strings == null) {
            return "null";
        }

        String start = "[";
        String delimiter = ", ";
        String end = "]";
        String s = "";
        String empty = "None";

        s = s + start;

        for (int i = 0; i < strings.length; i ++) {
            s = s + getValueOrDefault(strings, i, empty);
            //내가 마지막이 아니면
            //strings.length = 1, strings[0]
            //strings.length = 2, strings[1]

            //if(i != strings.length-1) {
            //    s = s + delimiter;
            // }
//            if(i == strings.length-1) {
//                continue;
//            }
            s = s + delimiter;
        }

        s = s.substring(0, s.length()-delimiter.length()) + end;
        return s;
    }

    public static String getValueOrDefault(String[] strings, int index, String defalut) {
        if (strings[index] == null) {
            return defalut;
        }
        return strings[index];
    }

    public static String printPretty2(String[] strings) {

        if(strings==null) {
            return "null";
        }

        String empty = "none1";
        String start = "[";
        String end = "]";
        String delimiter = ", ";
        String s = "";

        s = s + start;

      if (strings.length==1) {
            if (strings[0] == null) {
                s = s + empty;
            } else {
                s = s + strings[0];
            }
        } else if(strings.length==2) {
            if(strings[0] == null) {
                s = s + empty;
            } else {
                s = s + strings[0];
            }
            s = s + delimiter;
            if(strings[1] == null) {
                s = s + empty;
            } else {
                s = s + strings[1];
            }
        } else if(strings.length == 3) {
            if(strings[0] == null) {
                s = s + empty;
            } else {
                s = s + strings[0];
            }
            s = s + delimiter;
            if(strings[1] == null) {
                s = s + empty;
            } else {
                s = s + strings[1];
            }
            s = s + delimiter;
            if(strings[2] == null) {
                s = s + empty;
            } else {
                s = s + strings[2];
            }
        }
        s = s + end;
        return s;
    }




}
