//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Hello and welcome!");

    int[] numbers = new int[10];

    numbers[0] = 45;
    numbers[1] = -7;
    numbers[2] = 102;
    numbers[3] = 3;
    numbers[4] = 29;
    numbers[5] = 14;
    numbers[6] = -18;
    numbers[7] = 253;
    numbers[8] = 18;
    numbers[9] = 10;

    System.out.println("\nOriginal Arrangement:");
    PrintingArrayElements(numbers);

    System.out.println("\n\nArranged with Selective sorting:");
    selectionSort(numbers);
    PrintingArrayElements(numbers);

    System.out.println("\n\nArranged with Selective sorting in Descending Order:");
    selectionSortDescend(numbers);
    PrintingArrayElements(numbers);

    System.out.println("\n\nArranged with Bubble Sorting:");
    bubbleSort(numbers);
    PrintingArrayElements(numbers);

    System.out.println("\n\nArranged with Bubble Sorting in Descending Order:");
    bubbleSortDescend(numbers);
    PrintingArrayElements(numbers);
}

private static void selectionSort(int[] arr)
{
    for(int lastSortedIndex = arr.length - 1; lastSortedIndex - 1 > 0; lastSortedIndex--)
    {
        int LargestIndex = 0;

        for(int i = LargestIndex + 1; i < lastSortedIndex; i++)
        {
            if(arr[i] > arr[LargestIndex])
            {
                LargestIndex = i;
            }
        }

        int temp = arr[LargestIndex];
        arr[LargestIndex] = arr[lastSortedIndex];
        arr[lastSortedIndex] = temp;

    }
}

private static void selectionSortDescend(int[] arr)
{
    int lastSortedIndex = arr.length;

    for(int i = 0; lastSortedIndex - 1 > i; i++)
    {
        int LargestIndex = 0;

        for (int j = i + 1; j < lastSortedIndex; j++)
        {
            if(arr[j] > arr[LargestIndex])
            {
                LargestIndex = j;
            }
        }

        int temp = arr[LargestIndex];
        arr[LargestIndex] = arr[i];
        arr[i] = temp;

    }
}

private static void bubbleSort(int[] arr)
{
    for(int lastSortedIndex = arr.length - 1;  lastSortedIndex > 0; lastSortedIndex--)
    {
        for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] > arr[i+1])
                {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }
            }
    }
}

private static void bubbleSortDescend(int[] arr)
{
    int ArrayIndex = arr.length;
    for(int i = 0; ArrayIndex - 1 > i; i++)
    {
        for(int j = 0; j < ArrayIndex - 1; j++)
        {
            if(arr[j] < arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

private static void PrintingArrayElements(int[] arr)
{

    for (int j : arr)
    {

        System.out.println("Element stored in this Index is: " + j);

    }

}

