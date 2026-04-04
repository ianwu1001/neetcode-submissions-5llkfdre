class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        # 建立對應表，讓我們能快速知道「右括號」對應的「左括號」是誰
        mapping = {")": "(", "}": "{", "]": "["}

        for char in s:
            # 1. 如果遇到的是右括號
            if char in mapping:
                # 檢查 stack 是否為空（你說的：stack 裡面沒東西就錯）
                if not stack:
                    return False
                
                # 檢查 stack 最上方是否成對（你說的：不成對也錯）
                top_element = stack.pop()
                if mapping[char] != top_element:
                    return False
            else:
                # 2. 如果是左括號，就放進去 stack 中
                stack.append(char)

        # 3. 最後檢查 stack 裡面還有沒有東西（沒有代表完全合法）
        return not stack
        