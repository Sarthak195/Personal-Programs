# Operator Overloading in Python: Adding Two Distances (Feet and Inches)

This program demonstrates **operator overloading** in Python using the `+` operator to add two distances measured in feet and inches.

## 🧠 Concept
Operator overloading allows custom behavior for built-in operators (like `+`, `-`, etc.) when used with user-defined objects.

In this example, the `__add__()` method is overloaded to handle addition of two `Distance` objects.

## 🧩 Python Code

```python
class Distance:
    def __init__(self, feet=0, inches=0):
        self.feet = feet
        self.inches = inches

    def __add__(self, other):
        # Add the feet and inches
        total_feet = self.feet + other.feet
        total_inches = self.inches + other.inches

        # Convert 12 inches = 1 foot
        if total_inches >= 12:
            extra_feet = total_inches // 12
            total_feet += extra_feet
            total_inches = total_inches % 12

        # Return a new Distance object
        return Distance(total_feet, total_inches)

    def __str__(self):
        return f"{self.feet} feet {self.inches} inches"


# Example usage
d1 = Distance(5, 9)
d2 = Distance(3, 8)

print("First Distance:", d1)
print("Second Distance:", d2)

d3 = d1 + d2  # Using overloaded '+' operator
print("Total Distance:", d3)
```

## 🧮 Output Example

```
First Distance: 5 feet 9 inches
Second Distance: 3 feet 8 inches
Total Distance: 9 feet 5 inches
```

## 📘 Explanation

1. **`Distance` class** — Represents distance in feet and inches.
2. **`__add__()`** — Overloaded to add two distances correctly, converting extra inches to feet.
3. **`__str__()`** — Provides a user-friendly string output.
