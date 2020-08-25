package projectEuler.till20;

// If the numbers 1 to 5 are written out in words: one, two, three, four, five,
// then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
//  If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
//  how many letters would be used?
//
//
//  NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
//  and 115 (one hundred and fifteen) contains 20 letters.
//  The use of "and" when writing out numbers is in compliance with British usage.


// answer: 21124

public class Problem17 {
    private static final String EMPTY_SPACE = " ";
    private static final String WRONG_NUMBER = "WRONG NUMBER";
    private static final String SEPARATOR = "-";
    private static final String AND = "AND";
    private static final String ZERO = "ZERO"; // 0
    private static final String ONE = "ONE"; // 1
    private static final String TWO = "TWO"; // 2
    private static final String THREE = "THREE"; // 3
    private static final String FOUR = "FOUR"; // 4
    private static final String FIVE = "FIVE"; // 5
    private static final String SIX = "SIX"; // 6
    private static final String SEVEN = "SEVEN"; // 7
    private static final String EIGHT = "EIGHT"; // 8
    private static final String NINE = "NINE"; // 9
    private static final String TEN = "TEN"; // 10
    private static final String ELEVEN = "ELEVEN"; // 11
    private static final String TWELVE = "TWELVE"; // 12
    private static final String THIRTEEN = "THIRTEEN"; // 13
    private static final String FOURTEEN = "FOURTEEN"; // 14
    private static final String FIFTEEN = "FIFTEEN"; // 15
    private static final String SIXTEEN = "SIXTEEN"; // 16
    private static final String SEVENTEEN = "SEVENTEEN"; // 17
    private static final String EIGHTEEN = "EIGHTEEN"; // 18
    private static final String NINETEEN = "NINETEEN"; // 19
    private static final String TWENTY = "TWENTY"; // 20
    private static final String THIRTY = "THIRTY"; // 30
    private static final String FORTY = "FORTY"; // 40
    private static final String FIFTY = "FIFTY"; // 50
    private static final String SIXTY = "SIXTY"; // 60
    private static final String SEVENTY = "SEVENTY"; // 70
    private static final String EIGHTY = "EIGHTY"; // 80
    private static final String NINETY = "NINETY"; // 90
    private static final String HUNDRED = "HUNDRED"; // 100
    private static final String THOUSAND = "THOUSAND"; // 1000

    public static void main(String[] args) {
        int number = 1000;
        long result = numberLetterCounts(number);

        System.out.println(result);
    }

    private static long numberLetterCounts(int number) {
        long counter = 0L;
        for (int i = 1; i <= number; i++) {
            String fullNameOfInt = getFullNameOfInt(String.valueOf(i));
            int length = fullNameOfInt.length();
            counter = counter + length;

            System.out.println(fullNameOfInt.length() + " - " + fullNameOfInt + " - " + i);
        }

        return counter;
    }

    private static String getFullNameOfInt(String number) {
        int length = number.length();
        if (length == 1) {
            char under10 = number.charAt(0);
            return getStringFromInt(Integer.parseInt(String.valueOf(under10)));
        } else if (length == 2) {
            String stringFromInt = getStringFromInt(Integer.parseInt(number));
            if (!stringFromInt.equals(WRONG_NUMBER)) {
                return stringFromInt;
            }

            char under100 = number.charAt(0);
            char under10 = number.charAt(1);
            String under10String = getStringFromInt(Integer.parseInt(String.valueOf(under10)));
            String under100String = getStringFromInt(Integer.parseInt(under100 + "0"));

            return !under10String.equals(ZERO) ? under100String + under10String : under100String;
        } else if (length == 3) {
            String xxNumber = getStringFromInt(Integer.parseInt(number.substring(1, 3)));
            if (!xxNumber.equals(WRONG_NUMBER)) {
                char under1000 = number.charAt(0);
                String under1000StringHundred = getStringFromInt(100);
                String under1000StringSingle = getStringFromInt(Integer.parseInt(String.valueOf(under1000)));
                return !xxNumber.equals(ZERO) ? under1000StringSingle + under1000StringHundred + AND + xxNumber : under1000StringSingle + under1000StringHundred;
            }

            char under1000 = number.charAt(0);
            char under100 = number.charAt(1);
            char under10 = number.charAt(2);
            String under10String = getStringFromInt(Integer.parseInt(String.valueOf(under10)));
            String under100String = getStringFromInt(Integer.parseInt(under100 + "0"));
            String under1000StringHundred = getStringFromInt(100);
            String under1000StringSingle = getStringFromInt(Integer.parseInt(String.valueOf(under1000)));

            String secondPart = !under10String.equals(ZERO) ? under100String + under10String : under100String;
            return !secondPart.equals(ZERO) ? under1000StringSingle + under1000StringHundred + AND + secondPart : under1000StringSingle + under1000StringHundred;
        } else {
            // TODO in case if needed - for now return just ONE THOUSAND
//            return ONE + EMPTY_SPACE + THOUSAND;
            return ONE + THOUSAND;
        }
    }

    private static String getStringFromInt(int number) {
        switch (number) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            case 10:
                return TEN;
            case 11:
                return ELEVEN;
            case 12:
                return TWELVE;
            case 13:
                return THIRTEEN;
            case 14:
                return FOURTEEN;
            case 15:
                return FIFTEEN;
            case 16:
                return SIXTEEN;
            case 17:
                return SEVENTEEN;
            case 18:
                return EIGHTEEN;
            case 19:
                return NINETEEN;
            case 20:
                return TWENTY;
            case 30:
                return THIRTY;
            case 40:
                return FORTY;
            case 50:
                return FIFTY;
            case 60:
                return SIXTY;
            case 70:
                return SEVENTY;
            case 80:
                return EIGHTY;
            case 90:
                return NINETY;
            case 100:
                return HUNDRED;
            case 1000:
                return THOUSAND;
            default:
                return WRONG_NUMBER;
        }
    }
}
