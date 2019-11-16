package Part2;

public class Part2 {
    public static String coder(String message) {
        char[] symbolChar;
        StringBuilder sb = new StringBuilder();
        char[] charMessage = message.toCharArray();
        boolean flagZero = false;
        boolean flagOne = false;
        if (charMessage.length <= 0|| charMessage.length>=100){
            return null;
        }

        for (int i = 0; i < charMessage.length; i++) {
            symbolChar = Integer.toBinaryString(charMessage[i]).toCharArray();
            sb.append(" 00 ").append("0");
            for (int j = 0; j < symbolChar.length; j++) {
                if (!flagZero && symbolChar[j] == '0') {
                    sb.append(" 00 ").append("0");
                    flagZero = true;
                    flagOne = false;
                } else {
                    if (flagZero && symbolChar[j] == '0') {
                        sb.append("0");
                    }
                }

                if (!flagOne && symbolChar[j] == '1') {
                    sb.append(" 0 ").append("0");
                    flagOne = true;
                    flagZero = false;
                } else {
                    if (flagOne) {
                        sb.append("0");
                    }
                }
            }
        }
        return sb.toString().replaceAll("^\\s","");
    }
}
