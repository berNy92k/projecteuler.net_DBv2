package projectEuler.till20;

// By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
//
//  3
//  7 4
//  2 4 6
//  8 5 9 3
//
//  That is, 3 + 7 + 4 + 9 = 23.
//
//  Find the maximum total from top to bottom of the triangle below:
//
//                 75
//                95 64
//               17 47 82
//              18 35 87 10
//             20 04 82 47 65
//            19 01 23 75 03 34
//           88 02 77 73 07 63 67
//          99 65 04 28 06 16 70 92
//         41 41 26 56 83 40 80 70 33
//        41 48 72 33 47 32 37 16 94 29
//       53 71 44 65 25 43 91 52 97 51 14
//      70 11 33 28 77 73 17 78 39 68 17 57
//     91 71 52 38 17 14 91 43 58 50 27 29 48
//   63 66 04 68 89 53 67 30 73 16 69 87 40 31
//  04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
//
//  NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route.
//  However, Problem 67, is the same challenge with a triangle containing one-hundred rows;
//  it cannot be solved by brute force, and requires a clever method! ;o)

public class Problem18 {
    private static int lengthVertical = 0;
    private static int lengthHorizontal = 0;
    private static final String EMPTY_SPACE = " ";
    private static final String SEPARATOR = ";";
    private static final String bigTree = "" +
            "75;" +
            "95 64;" +
            "17 47 82;" +
            "18 35 87 10;" +
            "20 04 82 47 65;" +
            "19 01 23 75 03 34;" +
            "88 02 77 73 07 63 67;" +
            "99 65 04 28 06 16 70 92;" +
            "41 41 26 56 83 40 80 70 33;" +
            "41 48 72 33 47 32 37 16 94 29;" +
            "53 71 44 65 25 43 91 52 97 51 14;" +
            "70 11 33 28 77 73 17 78 39 68 17 57;" +
            "91 71 52 38 17 14 91 43 58 50 27 29 48;" +
            "63 66 04 68 89 53 67 30 73 16 69 87 40 31;" +
            "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23;";
    private static final String smallTree = "" +
            "3;" +
            "7 4;" +
            "2 4 6;" +
            "8 5 9 3;";

    public static void main(String[] args) {
        int result = maximumPathSumI();

        System.out.println(result);
    }

    private static int maximumPathSumI() {
        int[][] tree = getTree();
        lengthVertical--;
        lengthHorizontal--;
        for (int i = lengthVertical - 1; i >= 0; i--) {
            for (int j = 0; j < lengthHorizontal; j++) {
                int singleValue1a = tree[i + 1][j];
                int singleValue1b = tree[i + 1][j + 1];
                int singleValue2 = tree[i][j];
                int sum1 = singleValue1a + singleValue2;
                int sum2 = singleValue1b + singleValue2;
                tree[i][j] = sum1 > sum2 ? sum1 : sum2;
            }
            lengthHorizontal--;
        }

        return tree[0][0];
    }

    private static int[][] getTree() {
        String[] tree = bigTree.split(SEPARATOR);
        for (String singleLine : tree) {
            lengthVertical++;
            String[] singleLineArray = singleLine.split(EMPTY_SPACE);
            lengthHorizontal = lengthHorizontal > singleLineArray.length ? lengthHorizontal : singleLineArray.length;
        }

        int[][] as = new int[lengthVertical][lengthHorizontal];
        for (int i = 0; i < tree.length; i++) {
            String[] singleLineArray = tree[i].split(EMPTY_SPACE);
            for (int j = 0; j < singleLineArray.length; j++) {
                as[i][j] = Integer.parseInt(singleLineArray[j]);
            }
        }

        return as;
    }
}
