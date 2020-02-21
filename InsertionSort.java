public class InsertionSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++) // iterates through all elements of the array
        {
            //sets a target value value
            int val = a[i];
            int x = i-1;

            //shifts values until the target is reached, and is placed
            while (x >= 0 && a[x] > val)
            {
                a[x+1] = a[x];
                x--;
            }
            a[x+1] = val;
        }
    }
}
