import java.util.*;

public class FindTheDifferenceOfTwoArrays {

    //Lvl: Easy

    //Runtime: 9ms
    //Beats 95.15% of users with Java

    //Memory: 44.62MB
    //Beats 72.48% of users with Java

    //TODO: Given two 0-indexed integer arrays nums1 and nums2,
    // return a list answer of size 2 where: answer[0] is a list
    // of all distinct integers in nums1 which are not present in
    // nums2. answer[1] is a list of all distinct integers in nums2
    // which are not present in nums1. Note that the integers in the
    // lists may be returned in any order.

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null){
            List<List<Integer>> resultList = new ArrayList<>();
            resultList.add(null);
            resultList.add(null);
            return resultList;
        }

        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();
        for (int n: nums1){
            nums1Set.add(n);
        }
        for (int n: nums2){
            nums2Set.add(n);
        }
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());
        for (int n: nums1Set){
            if (!nums2Set.contains(n)){
                resultList.get(0).add(n);
            }
        }
        for (int n: nums2Set){
            if (!nums1Set.contains(n)){
                resultList.get(1).add(n);
            }
        }
        return resultList;
    }
}
