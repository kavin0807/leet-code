class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        if (arr == null || arr.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();
        
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int l = j + 1;
             int r = arr.length - 1;
                
                while (l < r) {
                   long sum = arr[i];
                   sum+=  arr[j];
                   sum += arr[l];
                   sum+= arr[r] ;

                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[l], arr[r]));
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}
