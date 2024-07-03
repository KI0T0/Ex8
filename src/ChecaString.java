public class ChecaString {

    public boolean ChecaStr(String str1, String str2) {

        if (str1.length() < 2 || str2.length() < 2) {

            return false;

        }

        char ultimoCharStr1 = str1.charAt(str1.length() - 1);
        char penultimoCharStr1 = str1.charAt(str1.length() - 2);

        char ultimoCharStr2 = str2.charAt(0);
        char penultimoCharStr2 = str2.charAt(1);

        return ultimoCharStr1 == penultimoCharStr2 && penultimoCharStr1 == ultimoCharStr2;
    }
}