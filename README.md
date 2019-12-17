# Test_12_17
**QUESTIONS**

What is the difference in Dalvik and ART?
>Dalviik uses a JIT compiler to compile the code; compiled during the installation of the appArt uses a AOT compiler to compile the code; part of the code is compiled during installation while the other half is compiled during runtime dynamically

What is the DEX Limit?
>65,536

What are launch modes?
>Instructions for how the app should be launched (standard, singleTop, singleTask, singleInstance). Changes how the activities are stored( in backstack) and created .

What are form factors?
>Different devices ie. tablet, 4inch phone, 6inch phone, etc.

What are Layout Qualifiers?
>Are given based on the phone state and can be used to change the activity


**CODING**

Result:
![screenshot](https://i.imgur.com/2us0h8M.png)

Create a function to print the duplicates in a list of strings
>findDuplicates(List<String> strings), set each element of the string to a hash set and when .add() would be false added printed that value

Create function to check if the string is a palindrome without using string.reverse() method
>checkPalindrome(String word), use a for loop that goes through the entire string and returns false if the string[i] != string[(string.length()-1) -i]

Create a function that will print: "fizz" if the number is divisible by 3, "buzz" if the number is divisible by 5, "fizzbuzz" is the number is divisible by both
>isDivisible(int num), used mulitple if statements and the modulus operator to check if the number was divisible by 3, 5 or both
