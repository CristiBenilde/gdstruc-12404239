//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    int numbers[] = {
            120, 118, 23, 126, 67, 46, 124, 108, 51, 141,
            6, 127, 113, 194, 34, 43, 184, 199, 21, 84,
            189, 81, 109, 117, 10, 140, 49, 88, 58, 160,
            115, 163, 63, 97, 104, 74, 7, 135, 85, 66,
            198, 60, 55, 133, 79, 165, 134, 44, 110, 136,
            18, 168, 181, 5, 92, 69, 20, 187, 156, 105,
            9, 186, 114, 106, 73, 93, 13, 70, 169, 150,
            180, 152, 137, 155, 175, 33, 101, 167, 149, 123,
            45, 164, 42, 57, 75, 177, 119, 2, 191, 78,
            174, 68, 72, 196, 54, 59, 91, 86, 89, 4 };

    System.out.println("\nBouncy Ball Algorithm\nHow it Works:\nIt will start looking for your Input starting in the Middle");
    System.out.println("then looks to the left then to the right then back to the left over and over until it finds the Value's Index.\n");

    System.out.println("There are " + numbers.length + " different numbers inside the array.\nand I'll choose 5 different numbers inside my Index.\n");
    System.out.println("The number 120 is located in Index " + bouncyBallSearch(numbers, 120) );
    System.out.println("The number 109 is located in Index " + bouncyBallSearch(numbers, 109) );
    System.out.println("The number 101 is located in Index " + bouncyBallSearch(numbers, 101) );
    System.out.println("The number 4 is located in Index " + bouncyBallSearch(numbers, 4) );
    System.out.println("The number 75 is located in Index " + bouncyBallSearch(numbers, 75) );

    System.out.println("\nAnd if I input a Number that's outside the List: " + bouncyBallSearch(numbers, 300) + "\nIt returns -1" );
}

public static int bouncyBallSearch(int[] input, int value) {
    int middle = input.length / 2;
    int step = 0;

    while (middle - step >= 0 || middle + step < input.length)
    {

        int left = middle - step;
        int right = middle + step;

        if (left >= 0 && input[left] == value)
        {
            return left;
        }
        else if (right < input.length && input[right] == value)
        {
            return right;
        }

        step++;
    }

    return -1;
}