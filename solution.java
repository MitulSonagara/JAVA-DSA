public class solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int mid = m + n / 2;

        int start = 0;
        int end = nums1.length;

        while (true) {
            int max1 = start + (end - start) / 2;
            int max2 = mid - max1 - 1;

            if (nums1[max1] <= nums2[max2 + 1] && nums1[max1 + 1] <= nums2[max2]) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(nums1[max1], nums2[max2]) + Math.min(nums1[max1 + 1], nums2[max2 + 1]))
                            / 2;
                } else {
                    return (double) Math.max(nums1[max1], nums2[max2]);
                }
            } else if (nums1[max1] > nums2[max2 + 1]) {
                end = max1 = 1;
            } else {
                start = max1 + 1;
            }
        }
    }
}
