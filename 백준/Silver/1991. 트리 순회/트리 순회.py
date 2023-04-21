class Node:
    def __init__(self, value, left,right):
        self.value = value
        self.left = left
        self.right = right


# preorder 전위순회   root 왼 오
def preorder(node):
    print(node.value,end='')
    if node.left != None:
        preorder(tree[node.left])
    if node.right != None:
        preorder(tree[node.right])

# inorder 중위순회  왼 root 오
def inorder(node):
    if node.left != None:
        inorder(tree[node.left])
    print(node.value,end='')
    if node.right != None:
        inorder(tree[node.right])


# postorder 후위순회  왼 오 root
def postorder(node):
    if node.left != None:
        postorder(tree[node.left])
    if node.right != None:
        postorder(tree[node.right])
    print(node.value,end='')

n = int(input())
tree = {}
for i in range(n):
    inputs = list(input().split())
    if inputs[1] == '.' : inputs[1] = None
    if inputs[2] == '.' : inputs[2] = None

    tree[inputs[0]] = Node(inputs[0], inputs[1],inputs[2])
    root = tree['A']

preorder(root)
print()
inorder(root)
print()
postorder(root)