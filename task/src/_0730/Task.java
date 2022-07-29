package _0730;

public class Task {

    //배열 사이즈를 받아, 만들기
    public String[] createOddNumberOrNullArray(int arraySize) {
        if (arraySize < 1) {
            System.out.println("양의 정수를 입력해주세요.");
        }

        String[] oddNumberOrNull = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int randomOddNumber = randomOddNumberOrZero();

            if (randomOddNumber == 0) {
                oddNumberOrNull[i] = null;
                continue;
            }

            String str = "";

            for (int j = 0; j < randomOddNumber; j++) {
                str += (char) (97 + i);
            }

            oddNumberOrNull[i] = str;
        }

        return oddNumberOrNull;
    }

    //홀수또는0 랜덤으로 받기
    private int randomOddNumberOrZero() {
        int i = (int) (Math.random() * 10);
        System.out.println(i);

        if (i % 2 == 0) {
            return 0;
        }
        return i;
    }

    //배열 두개를 받아서 더하기
    public String[] sumTwoArray(String[] a, String[] b) {
        if (a.length != b.length) {
            System.err.println("같은 크기의 배열만 처리할 수 있어요.");
        }

        String[] c = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null && b[i] == null) {
                c[i] = "EMPTY";
                continue;
            }

            if (a[i] == null) {
                c[i] = b[i];
                continue;
            }

            if (b[i] == null) {
                c[i] = a[i];
                continue;
            }

            c[i] = a[i] + b[i];
        }

        return c;
    }

    //배열을 받아서 표 그리기
    public String createTableByArray(String[] a) {
        String table = "+";

        for (int i=0; i<a.length; i++) {
            if(a[i] == null) {
                continue;
            }

            for (int j=0; j<a[i].length()+1; j++) {
                table += "-";
            }
        }

        table += "+ \n";
        table += "|";

        for (int i=0; i<a.length; i++) {
            if(a[i] == null) {
                continue;
            }
            table += a[i] + " " + "|";
        }

        table += "\n";
        table += "+";

        for (int i=0; i<a.length; i++) {
            if(a[i] == null) {
                continue;
            }

            for (int j=0; j<a[i].length()+1; j++) {
                table += "-";
            }
        }
        table += "+ \n";

        return table;
    }
}