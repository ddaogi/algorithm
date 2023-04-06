a = input()
b = input()
reverse =''
for i in str(b):
    reverse = i+reverse

for i in str(reverse):
    print(int(a)*int(i))
print(int(a)*int(b))