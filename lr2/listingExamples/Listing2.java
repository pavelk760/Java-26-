package lr2.listingExamples;

public class Listing2 {
    public static String getEncryptString(String encryptString, int shift) {
        // Строку → массив символов
        char[] arrayChar = encryptString.toCharArray();
        // Массив для хранения числовых кодов символов (long, чтобы избежать переполнения)
        long[] arrayInt = new long[arrayChar.length];
        // Массив для преобразованных символов
        char[] arrayCharNew = new char[arrayChar.length];

        // Цикл: к каждому символу прибавляется сдвиг
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift; // символ → число + сдвиг
            arrayCharNew[i] = (char) arrayInt[i]; // число → символ
        }

        // Массив символов → строка
        encryptString = new String(arrayCharNew);
        return encryptString;
    }
}
