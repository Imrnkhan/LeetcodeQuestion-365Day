package Coding_Question;

import java.util.Arrays;

public class AddTwoNumber {
    public static void main(String[] args) {
        int[] nums2 = {9,9,9,9,9,9,9};
        int[] nums1 = {9,9,9,9};



        System.out.println(Arrays.toString(AddNumber(nums1, nums2)));
    }

        public static int[] AddNumber(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int maxLen = Math.max(n, m);
            int[] result = new int[maxLen + 1];
            int carry = 0;

            for (int i = 0; i < maxLen; i++) {
                int sum = carry;
                if (i < n) sum += nums1[n - i - 1];
                if (i < m) sum += nums2[m - i - 1];
                result[maxLen - i] = sum % 10;
                carry = sum / 10;
            }

            if (carry > 0) {
                result[0] = carry;
            } else {
                result = Arrays.copyOfRange(result, 1, maxLen + 1);
            }

//            System.out.println(Arrays.toString(result));
            return result;
        }

    }

