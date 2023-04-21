import sys
input = sys.stdin.readline
sys.setrecursionlimit(100000)
class Node:
    def __init__(self,value) -> None:
        self.value= value
        self.left = None
        self.right = None
    
# def make_tree(node: Node, new):
#     if new < node.value:
#         if node.left != None:
#             make_tree(node.left,new)
#         else:
#             new_node = Node(new)
#             node.left = new_node
#     elif new > node.value:
#         if node.right != None:
#             make_tree(node.right,new)
#         else:
#             new_node = Node(new)
#             node.right = new_node

#     elif node is None:
#         return
def make_tree(node: Node, new):
    if new < node.value:
        if node.left != None:
            make_tree(node.left,new)
        else:
            new_node = Node(new)
            node.left = new_node
    elif new > node.value:
        if node.right != None:
            make_tree(node.right,new)
        else:
            new_node = Node(new)
            node.right = new_node
    else:
        # node.value == new
        return

    if node is None:
        new_node = Node(new)
        return new_node

    
    
# postorder 후위순회  왼 오 root
def postorder(node):
    if node is None:
        return
    if node.left != None:
        postorder(node.left)
    if node.right != None:
        postorder(node.right)
    print(node.value)

nums = []
while True:
    try:
        n = int(input().strip())
        nums.append(n)
    except:
        break

root = Node(nums[0])
for i in range(1,len(nums)):
    make_tree(root, nums[i])

postorder(root)