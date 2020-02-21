// from https://www.geeksforgeeks.org/merge-sort/
public class MergeSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a)
    {
        sorter(a,0,a.length-1);
    }

    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int sizeL = m - l + 1;
        int sizeR = r - m;

        //create temp arrays
        int L[] = new int [sizeL];
        int R[] = new int [sizeR];

        for (int i=0; i<sizeL; ++i)
        {
            L[i] = arr[l + i];
        }
        for (int j=0; j<sizeR; ++j)
        {
            R[j] = arr[m + 1+ j];
        }

        // Merges the temp arrays
        int i = 0;
        int j = 0;

        int k = l;
        while (i < sizeL && j < sizeR)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copies remaining elements
        while (i < sizeL)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copies remaining elements
        while (j < sizeR)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sorter(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first half
            sorter(arr, l, m);
            // Sort second half
            sorter(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
