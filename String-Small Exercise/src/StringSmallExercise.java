public class StringSmallExercise {
    public static void main(String[] args) {
        String myString = "bBffFDGddbB";
        String myString2 = "abc";
        String myString3 = "lovely string";
        String myString4 = "helloabcdhelloasvbhellogdvmhello";
        String myString5 = "helloBéla";
        System.out.println(getOccuranceOfBs(myString));
        System.out.println(getOccuranceOfBs(myString2));
        System.out.println(getHelloOccurance(myString3));
        System.out.println(getHelloOccurance((myString4)));
        System.out.println(getOccuranceOfBs(myString5));
        System.out.println(getHelloOccurance(myString5));
    }

    private static int getHelloOccurance(String input) {
        int counter = 0;
        int index = input.indexOf("hello");
        while (index != -1) {
            counter++;
            index = input.indexOf("hello", index + 1);
        }
        return counter;
    }

    private static int getOccuranceOfBs(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'B') {
                counter++;
            }
        }
        return counter;
    }
}
