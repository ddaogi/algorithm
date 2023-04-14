# import sys 
# input = sys.stdin.readline



def is_valid(text: str) -> str:
    new_arr = []
    for ch in text:
        if ch == '(':
            new_arr.append(ch)
        else:
            if len(new_arr)!=0:
                new_arr.pop()
            else:
                return "NO"
    
    if len(new_arr)!=0:
        return "NO"
    else:
        return "YES"

        

if __name__ == "__main__":
    n = int(input())
    ans_list = []
    for i in range(n):
        ans_list.append(is_valid(input()))

    for ans in ans_list:
        print(ans)

