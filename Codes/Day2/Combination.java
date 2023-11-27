class Solution {
    public static void generate(List<List<Integer>> result, List<Integer> list, int k, int n, int start) {
        if(k == 1 && start <= n && n <= 9) {
            list.add(n);
            result.add(new ArrayList<>(list));
            list.remove(Integer.valueOf(n));
            return;
        }
        for(int i = start; i <= 9; i++) {
            if(i <= n && n - i > i) {
                list.add(i);
                generate(result, list, k - 1, n - i, i + 1);
                list.remove(Integer.valueOf(i));
            }
            else break;
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generate(result, list, k, n, 1);
        return result;
    }
}
