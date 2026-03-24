// Problem Statement
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

// First solution brute-force, finding a solution first before optimize
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);
        int combinedArrLength = combinedArray.length;
        Arrays.sort(combinedArray);
        if (combinedArrLength % 2 != 0)
        {
            return combinedArray[combinedArrLength / 2];
        }
        else
        {
            double firstMedian = combinedArray[combinedArrLength / 2];
            double secMedian = combinedArray[combinedArrLength / 2 - 1];
            return (firstMedian + secMedian)  / 2;
        }
    }
}
