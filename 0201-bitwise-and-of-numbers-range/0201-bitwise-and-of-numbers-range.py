class Solution(object):
    def rangeBitwiseAnd(self, left, right):
        self=0
        while(left<right):
            left>>=1
            right>>=1
            self+=1

        return left<<self
        