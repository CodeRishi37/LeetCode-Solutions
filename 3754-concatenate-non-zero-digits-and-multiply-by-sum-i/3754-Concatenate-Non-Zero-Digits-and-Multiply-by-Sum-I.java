class Solution(object):
    def sumAndMultiply(self, n):
        """
        :type n: int
        :rtype: int
        """
        x = 0
        r = 0
        i = 0
        sum = 0
        while n!=0:
            r = n%10
            if r!=0:
                x += r*(10**i)
                i+=1
                sum+=r
            n/=10
        return x*sum
            