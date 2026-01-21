num=input("Enter number to check:")
res= num[::-1]
if res==num:
    print(num,"is a palindrome")
else:
    print(num," is not a palindrome")