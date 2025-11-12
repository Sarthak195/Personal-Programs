number = int(input("Enter a number: "))
if number <= 1:
    print(number," is not a prime number.")
for i in range(2, int(number**0.5) + 1):
    if number % i == 0:
        print(number,"is not a prime number.")
    else:
        print(number,"is a prime number.")    