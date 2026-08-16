class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
         int nof = fruits.length;
        int nob = baskets.length;
        boolean[] isBasketused = new boolean[nob];
        int unplacedfruits = nof;
        for (int fruitsize : fruits) {
            for (int basketindex = 0; basketindex < nob; basketindex++) {
                if (baskets[basketindex] >= fruitsize && !isBasketused[basketindex]) {
                    isBasketused[basketindex] = true;
                    unplacedfruits--;
                    break;
                }
            }
        }
        return unplacedfruits;
    }
}