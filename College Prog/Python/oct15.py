# Program: Operator Overloading to Add Two Distances in Feet and Inches

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
