#WAP of tuple having 5 elements, perform square of each element and store inside a new tuple
ori = (1, 2, 3, 4, 5)
squ = tuple(x**2 for x in ori)
print("Original tuple:", ori)
print("Squared tuple:", squ)