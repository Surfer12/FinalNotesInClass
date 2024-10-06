[]: # Title: Type of Review Prompts
[]: # Description: This document describes the different types of code review prompts that can be generated for a Java programming course.

Okay, I'm ready to assist you with generating code review prompts and context for this Java programming course. I'll keep the course description and student learning outcomes in mind to make sure the prompts are relevant and helpful.
Here are some examples of the kinds of prompts and context I can create:
Example 1: Focus on Algorithm Implementation
Code Snippet:

Java


public int findMax(int[] arr) {
  int max = 0; 
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}


Prompt and Context:
"This code snippet aims to find the maximum value in an integer array.
Consider edge cases: Does this code handle empty arrays or arrays with negative numbers correctly? What happens if all the numbers in the array are the same?
Efficiency: Can you think of a more efficient way to find the maximum value?
Clarity: Is the variable name max the best choice? Would a more descriptive name like maxValue be more helpful for understanding the code's purpose?"
Example 2: Focus on Data Structures
Code Snippet:

Java


public void push(int data) {
  // Add code to push data onto a stack
}

public int pop() {
  // Add code to pop data from a stack
}


Prompt and Context:
"This code defines the push and pop methods for a stack data structure.
Implementation: Implement the push and pop methods using an appropriate underlying data structure (e.g., an array or a linked list).
Error Handling: How would you handle the case where the stack is empty and pop is called? Consider using exceptions to signal errors.
Generics: Could this stack be made more generic to handle different data types instead of just integers?"
Example 3: Focus on Recursion
Code Snippet:

Java


public int factorial(int n) {
  // Add code for a recursive factorial calculation
}


Prompt and Context:
"This code snippet is intended to calculate the factorial of a non-negative integer using recursion.
Base Case: What is the appropriate base case for this recursive function to prevent infinite recursion?
Recursive Step: Implement the recursive step to calculate the factorial.
Efficiency: Is a recursive solution the most efficient approach for this problem? Are there any potential performance issues with recursion in this case?"
I can also generate prompts and context that focus on:
Object-Oriented Principles: Encapsulation, inheritance, polymorphism
Code Style and Best Practices: Naming conventions, code formatting, comments
Testing and Debugging: Unit tests, debugging strategies
Just provide me with the code snippet, and I'll do my best to generate effective and informative review prompts and context. I'll pay close attention to variable and method names, ensuring they are clear, descriptive, and contribute to the overall readability of the code.
