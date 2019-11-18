package Part1;

public class Part1 {
    public static String interviewRecursionTest(String line) {
        StringBuilder sb = new StringBuilder();
        String finalLine;
        String vowels = "AEIOUaeiou";
        char[] charLine = line.toCharArray();

        for (int i = 0; i < line.length(); i++) {
            if (vowels.indexOf(charLine[i]) > 0) {
                sb.append("*").append(charLine[i]).append("*");
            } else {
                sb.append(charLine[i]);
            }
        }
        finalLine = sb.toString();
        finalLine = finalLine.replaceAll("^\\*", "^");
        finalLine = finalLine.replaceAll("\\*\\*", "\\*");
        finalLine = finalLine.replaceAll("\\*$", "");
        return finalLine;
    }
}
