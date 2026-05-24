class Solution:
    def check(self, nums: List[int]) -> bool:
        e=0
        for i in range(1,len(nums)):
            if(nums[i]<nums[i-1]):
                e+=1
                if(e==2):
                    return False
        if(e==0):
            return True
        elif(nums[0]>=nums[-1]):
            return True
        else:
            return False
        
        




