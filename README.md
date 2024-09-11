# Hello, this is my header!
# Find All Duplicates
# Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

# Describe Different Approaches to Solving This Problem   Describe the two different ways to figure out all of the duplicate values of a list of integers in english. The first solution is the nested loop solution. The second solution is to use a dictionary or a map (similar to the containsPair method we wrote in class. Describe both in as much detail as you can (with no code) and describe the trade-offs between the two solutions.

# A nested loop solution is kind of a brute force solution. It works well with smaller sized sets, but is terrible with large sized ones. It has a time complexity of O(n^2) because you are a comparing an object of the set with another object in the set with two loops.

# A dictionary or map implementation is far more efficient with larger sets, but not much better with smaller ones. It has a time complexity of O(n) as it only needs to get across the set once in order to finish. 