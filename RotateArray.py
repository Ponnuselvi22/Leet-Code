class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        n = len(nums)
        k %= n  # Still required to keep k within array bounds
        
        # Take the last k elements and put them before the rest
        nums[:] = nums[-k:] + nums[:-k]
