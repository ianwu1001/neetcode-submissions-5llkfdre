class Solution:
    def isValid(self, s: str) -> bool:
        # 當字串中還包含任何一種成對括號時，就繼續消除
        while "()" in s or "{}" in s or "[]" in s:
            s = s.replace("()", "")
            s = s.replace("{}", "")
            s = s.replace("[]", "")
    
        # 如果最後字串被消光了，代表全部匹配，回傳 True
        return s == ""
        