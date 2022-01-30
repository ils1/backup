import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _4_MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list1.addAll(list2);
        Collections.sort(list1);
        if (list1.size() % 2 == 0) {
            double one = list1.get(list1.size()/2);
            double two = list1.get(list1.size()/2 - 1);
            return (one + two) / 2;
        }
        else {
            return (list1.get(list1.size()/2));
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
