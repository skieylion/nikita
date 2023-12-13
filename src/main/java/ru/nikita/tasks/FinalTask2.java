package ru.nikita.tasks;

public class FinalTask2 {
    public static void main(String[] args) {
        class Solution {
            public void merge(int[] nums1, int m, int[] nums2, int n) {
                int offset = m;
                lable:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < offset; j++) {
                        if (nums1[j] > nums2[i]) {
                            for (int k = nums1.length - 1; k > j; k--) {
                                nums1[k] = nums1[k - 1];
                            }
                            nums1[j] = nums2[i];
                            offset++;
                            continue lable;

                        }

                    }
                    nums1[offset++] = nums2[i];
                }
            }
        }
    }
}