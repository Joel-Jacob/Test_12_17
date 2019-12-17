//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

class Main {
  public static void main(String[] args) {
    //Question1
    List<String> strings = new ArrayList<>();
    strings.add("fizz");
    strings.add("buzz");
    strings.add("laugh");
    strings.add("staff");
    strings.add("staff");
    Duplicates duplicates = new Duplicates();
    duplicates.findDuplicates(strings);
    //End Question1

    //Question 2
    String word = "racecar";
    Palindrome palindrome = new Palindrome();
    if(palindrome.checkPalindrome(word))
      System.out.println(word + " is a palindrome");
    else System.out.println(word + " is not a palindrome");
    //End Question 2

    //Question 3
    int num = 30;
    Divisible divisible = new Divisible();
    System.out.println(divisible.isDivisible(num));
    //End Question 3

  }
}

class Duplicates{
  public void findDuplicates(List<String> strings){
    HashSet<String> stringSet = new HashSet<String>();

    for(int i=0;i<strings.size();i++){
      if(stringSet.add(strings.get(i)) == false){
        System.out.println(strings.get(i));
      }
    }

  }
}

class Palindrome{
  public boolean checkPalindrome(String word){
    boolean isPalindrome = true;
    for(int i =0; i< word.length();i++){
      if(word.getBytes()[i] != word.getBytes()[(word.length()-1) - i]){
        isPalindrome = false;
      }
    }

    return isPalindrome;
  }
}

class Divisible{
  public String isDivisible(int num){
    String temp = "";

    if(num%3 == 0 && num %5 == 0)
      temp = "fizzbuzz";
    else if(num%3 == 0)
      temp = "fizz";
    else if(num%5 == 0)
      temp = "buzz";

    return temp;
  }
}