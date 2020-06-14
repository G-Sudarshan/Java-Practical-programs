/*

Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting .
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Hackerrank problem



*/

public class Solution {

    static boolean isAnagram(String A, String B) {
        // Complete the function
       A=A.toLowerCase();
       B=B.toLowerCase();
       boolean f = false;
      char[] c = A.toCharArray();
      java.util.Arrays.sort(c); // since you can't directly import Arrays, use full package name
      char[] d = B.toCharArray();
      java.util.Arrays.sort(d);
      String a = new String (c);
      String b = new String (d);
      if (a.equals(b)) {
          f=true;
      }
      return f;

    }
