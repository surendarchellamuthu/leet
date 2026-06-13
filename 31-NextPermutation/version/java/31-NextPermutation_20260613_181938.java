// Last updated: 6/13/2026, 6:19:38 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4
5        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
6
7        if (i >= 0) {
8            int j = nums.length - 1;
9            while (nums[j] <= nums[i]) j--;
10
11            int temp = nums[i];
12            nums[i] = nums[j];
13            nums[j] = temp;
14        }
15
16        int l = i + 1, r = nums.length - 1;
17        while (l < r) {
18            int temp = nums[l];
19            nums[l++] = nums[r];
20            nums[r--] = temp;
21        }
22    }
23}