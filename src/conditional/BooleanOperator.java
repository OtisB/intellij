package conditional;

public class BooleanOperator {

public static void main() {
    int i = 0;
    int j = 7;
    int k = 13;

    // Snippet 1

    if (i > 0 || j > 5) {
        k = 10;
        // i = 0
        // j = 7
        //k = 10
    }

// Snippet 2
if (i > 0 && j > 5) {
        k = 10;
        // i = 0
        // j = 7
        //k = 13
    }

// Snippet 3
if ((i > 0 && j > 5) || k < 15) {
        k = 10;
        // i = 0
        // j = 7
        //k = 13
    }

// Snippet 4
if ((i > 0 || j > 5) && k > 15) {
        k = 10;
        // i = 0
        // j = 7
        //k = 13
    }

// Snippet 5
if (i == 0 & j++ < 5) {
        k = 10;
        // i = 0
        // j = 8
        //k = 13
    }

// Snippet 6
if (i == 0 && j++ < 5) {
        k = 10;
        // i = 0
        // j = 8
        //k = 13
    }

// Snippet 7
if (i != 0 && j++ < 5) {
        k = 10;
        // i = 0
        // j = 7
        //k = 13
    }

// Snippet 8
    //bit operator
if (i != 0 & j++ < 5) {
        k = 10;
        // i = 0
        // j = 8
        //k = 13
    }
        }
}
