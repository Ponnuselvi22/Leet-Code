import java.util.Random;

class Solution {
    private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
        this.array = nums;
        this.original = nums.clone(); // Store a copy for resetting
        this.rand = new Random();
    }
    
    public int[] reset() {
        this.array = this.original.clone(); // Reset to the stored original array
        return this.array;
    }
    
    public int[] shuffle() {
        // Implement the Fisher-Yates Shuffle
        for (int i = array.length - 1; i > 0; i--) {
            // Pick a random index from 0 to i inclusive
            int j = rand.nextInt(i + 1);
            
            // Swap array[i] with the element at random index j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
