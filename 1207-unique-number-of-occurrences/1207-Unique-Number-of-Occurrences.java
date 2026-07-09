class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        freq = {n:0 for n in arr}
        for n in arr:
            if n in freq:
                freq[n]+=1
        counts = freq.values()
        return len(counts) == len(set(counts))
                
                