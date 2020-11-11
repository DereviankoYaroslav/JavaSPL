public class Task7 {
    public static void main(String[] args) {

        int i1 = 32;
        System.out.println("Ціле число в десятковому представленні  - " + i1);
        String hexI1 = Integer.toHexString(i1).toUpperCase();
        System.out.println("Ціле число в шістнадцятирічному представленні - " + hexI1);
        String binI1 = Integer.toBinaryString(i1);
        System.out.println("Ціле число в двійковому представленні - " + binI1);

        //Зсув вліво
        int afterLeftShift = i1 << 2;
        System.out.println("Число в десятковому вигляді після зсуву вліво - " +afterLeftShift);
        String hexAfterLeftShift = Integer.toHexString(afterLeftShift).toUpperCase();
        System.out.println("Число в шістнадцятирічному представленні після зсуву вліво - " + hexAfterLeftShift);
        String binAfterLeftShift = Integer.toBinaryString(afterLeftShift);
        System.out.println("Число в бінарному представленні після зсуву вліво - " + binAfterLeftShift);

        //Зсув вправо
        int afterRightShift = i1 >> 2;
        System.out.println("Число в десятковому вигляді після зсуву вправо - " +afterRightShift);
        String hexAfterRightShift = Integer.toHexString(afterRightShift).toUpperCase();
        System.out.println("Число в шістнадцятирічному представленні після зсуву вправо - " + hexAfterRightShift);
        String binAfterRightShift = Integer.toBinaryString(afterRightShift);
        System.out.println("Число в бінарному представленні після зсуву вправо - " + binAfterRightShift);

        //Зсув вправо без врахування знаку
        int afterUnsignedRightShift = i1 >>> 3;
        System.out.println("Число в десятковому вигляді після вправо без врахування знаку - " +afterUnsignedRightShift);
        String hexAfterUnsignedRightShift = Integer.toHexString(afterUnsignedRightShift).toUpperCase();
        System.out.println("Число в шістнадцятирічному представленні після зсуву вправо без врахування знаку - " + hexAfterUnsignedRightShift);
        String binAfterUnsignedRightShift = Integer.toBinaryString(afterUnsignedRightShift);
        System.out.println("Число в бінарному представленні після зсуву вправо без врахування знаку- " + binAfterUnsignedRightShift);
    }
}
