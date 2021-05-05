/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class Sort {
    class SelectionSort
    {
        void sort(int arr[])
                {
                    int s = arr.length;
                    for(int i =0; i<s-1; i++)
                    {
                        int low_idx = i;
                        for(int j =i+1;j<s;j++)
                            if (arr[j] < arr[low_idx])
                                low_idx = j;
                        int temp = arr[low_idx];
                        arr[low_idx] = arr[i];
                        arr[i] = temp;
                    }
                }
        void printarr(int arr[])
        {
            int n =arr.length;
            for(int i=0;i<n;i++)
                System.out.println();
        }
        
    }
    
}
