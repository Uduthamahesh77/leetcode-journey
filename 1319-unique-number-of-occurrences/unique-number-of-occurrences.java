class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int arr1[]=new int[arr.length];
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
       for (int element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        HashSet<Integer> encounteredFrequencies = new HashSet<>();
        boolean allUnique = true;
        for (int frequency : map.values()) {
            if (!encounteredFrequencies.add(frequency)) {
                allUnique = false;
                break;
            }
        }
        if (allUnique) {
            return true;
        } else {
           return false;
        }
    }
}