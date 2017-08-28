
// done on leetcode playgrounds, hence the static main
class Combinationsum {
    static int[] arr;
    static boolean[] taken;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr2 = {-8,3,5,-3,-2,11,-11};
        boolean[] taken2 = new boolean[arr2.length];
        taken = taken2;
        arr = arr2;
        for(Set<Integer> sumSet: combinationSum(0)){
            System.out.println(sumSet);
        }
    }

    private static Set<Set<Integer>> combinationSum(int target){
        Set<Set<Integer>> combinationSet = new HashSet<Set<Integer>>();
        for (int i = 0; i < arr.length; i++){
            if (taken[i] == true){
                continue;
            }
            else{
                taken[i] = true;
                if (arr[i] == target){
                    Set<Integer> set = new HashSet<Integer>();
                    set.add(arr[i]);
                    combinationSet.add(set);
                }
                else{
                    Set<Set<Integer>> sumSet = combinationSum(target-arr[i]);
                    for (Set<Integer> combo: sumSet)
                        combo.add(arr[i]);
                    if (!sumSet.isEmpty() && !combinationSet.contains(sumSet))
                    	combinationSet.addAll(sumSet);
                }

            }
            taken[i] = false;
        }
        return combinationSet;
    }
}
