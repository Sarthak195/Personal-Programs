def ispalindrome(s):
    rstr = s[::-1]
    print(f"Reversed string: {rstr}")
    return s == rstr

# Example usage
str = input("Enter a string: ")
if ispalindrome(str):
    print("The string is a palindrome.")
else:
    print("The string is not a palindrome.")