num = int(input("Enter a number to find its factorial: "))
if num < 0:
    print("Factorial is not defined for negative numbers.")
elif num == 0 or num == 1:
    fact=0
else:
    result = 1
    for i in range(2, num + 1):
        result *= i
    fact=result
print("The factorial of number is",fact)