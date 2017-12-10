package HomeWork4;
import java.io.*;

public class StringManupulation {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("    Here are 30 different methods from String class.");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        //1. String charAt() Method - This method returns a char at the specified index.
        System.out.println("1. String charAt() Method");
        String s = "Shaheda Begum";
        char result = s.charAt(8);
        System.out.println(result);
        System.out.println();


        //2. String compareTo() Method - This method compares this String to another Object.
        System.out.println("2. String compareTo() Method");
        String str7 = "In Java Strings are immutable";
        String str5 = new String("In Java Strings are immutable");
        String str6 = new String("And Integers are not immutable");

        int result2 = str5.compareTo(str5);
        System.out.println(result2);

        result2 = str6.compareTo(str6);
        System.out.println(result2);
        System.out.println();

        //3. String concat() Method - This methods returns a string that represents the concatenation
        // of this object's characters followed by the string argument's characters.
        System.out.println("3. String concat() Method");
        String a = "It is nice to ";
        a = a.concat(" work with Strings");
        System.out.println(a);
        System.out.println();

        // 4. String copyValueOf() Method - This method returns a String that contains the characters
        // of the character array.
        System.out.println("4. String copyValueOf() Method");
        char[] Str1 = {'H', 'i', ' ', 'E', 'v', 'e', 'r', 'y', 'o', 'n', 'e', '!'};
        String Str2 = "";
        Str2 = Str2.copyValueOf(Str1);
        System.out.println("Returned String: " + Str2);
        System.out.println();

        //5. copyValueOf(data, offset, count) - This method returns a String that contains the characters of
        // the character array.
        System.out.println("5. copyValueOf(data, offset, count)");
        char[] Str4 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str5 = "";
        Str5 = Str5.copyValueOf(Str1, 2, 6);
        System.out.println("Returned String: " + Str5);
        System.out.println();

        //6. String endsWith() Method - This method returns true if the character sequence represented
        // by the argument is a suffix of the character sequence represented by this object; false otherwise.
        System.out.println("6. String endsWith() Method");
        String Str = new String("This is really not immutable!!");
        boolean retVal;

        retVal = Str.endsWith("immutable!!");
        System.out.println("Returned Value = " + retVal);

        retVal = Str.endsWith("immu");
        System.out.println("Returned Value = " + retVal);
        System.out.println();

        //7. String equalsIgnoreCase() Method - This method returns true if the argument is not null
        // and the Strings are equal, ignoring case; false otherwise.
        System.out.println("7. String equalsIgnoreCase() Method");
        String Str11 = new String("This is really not immutable!!");
        String Str21 = Str11;
        String Str31 = new String("This is really not immutable!!");
        String Str41 = new String("This IS REALLY NOT IMMUTABLE!!");
        boolean retVal1;

        retVal1 = Str11.equals(Str21);
        System.out.println("Returned Value = " + retVal1);

        retVal1 = Str11.equals(Str31);
        System.out.println("Returned Value = " + retVal1);

        retVal1 = Str11.equalsIgnoreCase(Str41);
        System.out.println("Returned Value = " + retVal1);
        System.out.println();

        //8. String hashCode() Method - This method returns a hash code value for this object.
        System.out.println("8. String hashCode() Method");
        String Str51 = new String("Welcome to my Java Class");
        System.out.println("Hashcode for Str :" + Str51.hashCode());
        System.out.println();

        //9. String indexOf() Method - This method returns the index within this string of the first
        // occurrence of the specified character or -1, if the character does not occur.
        System.out.println("9. String indexOf() Method");
        String Str61 = new String("Welcome to my Java Class");
        System.out.print("Found Index :");
        System.out.println(Str61.indexOf('J'));
        System.out.println();

        //10. String indexOf(String str) Method - This method returns the index within this string of the
        // first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.
        System.out.println("10. String indexOf(String str) Method");
        String Str71 = new String("Welcome to my Java Class");
        String SubStr72 = new String("Java");
        System.out.println("Found Index :" + Str71.indexOf(SubStr72));
        System.out.println();

        //11. indexOf(String str, int fromIndex) - This method returns the index within this string of the first
        // occurrence of the specified substring, starting at the specified index. If it does not occur,
        // -1 is returned.
        System.out.println("11. indexOf(String str, int fromIndex)");
        String Str81 = new String("Welcome to my Java Class");
        String SubStr82 = new String("Java");
        System.out.print("Found Index :");
        System.out.println(Str81.indexOf(SubStr82, 15));
        System.out.println();

        //12. String lastIndexOf() Method - This method returns the index of the last occurrence of the character
        // in the character sequence represented by this object that is less than or equal to fromIndex, or -1 if
        // the character does not occur before that point.
        System.out.println("12. String lastIndexOf() Method");
        String Str91 = new String("Welcome to my Java Class");
        System.out.print("Found Last Index :");
        System.out.println(Str91.lastIndexOf('s'));
        System.out.println();

        //13. String length() Method - This method returns the length of this string. The length is equal to the number
        // of 16-bit Unicode characters in the string.
        System.out.println("13. String length() Method");
        String Str100 = new String("Welcome to my Java Class");
        String Str102 = new String("Let's learn");

        System.out.print("String Length :");
        System.out.println(Str100.length());

        System.out.print("String Length :");
        System.out.println(Str102.length());
        System.out.println();

        //14. String matches() Method - This method tells whether or not this string matches the given regular
        // expression. An invocation of this method of the form str.matches(regex) yields exactly the same result
        // as the expression Pattern.matches(regex, str).
        System.out.println("14. String matches() Method");
        String Str103 = new String("Welcome to JavaClass");

        System.out.print("Return Value :");
        System.out.println(Str103.matches("(.*)Java(.*)"));

        System.out.print("Return Value :");
        System.out.println(Str103.matches("Java"));

        System.out.print("Return Value :");
        System.out.println(Str103.matches("Java(.*)"));
        System.out.println();

        //15. String regionMatches() ignoreCase - This method has two variants which can be used to test if
        // two string regions are equal.
        System.out.println("15. String regionMatches() ignoreCase");
        String Str104 = new String("Welcome to JavaClass");
        String Str204 = new String("JAVA");

        System.out.print("Return Value :");
        System.out.println(Str104.regionMatches(true, 11, Str204, 0, 9));
        System.out.println();

        //16. String replace() Method - This method returns a new string resulting from replacing all
        // occurrences of oldChar in this string with newChar.
        System.out.println("16. String replace() Method");
        String Str105 = new String("Welcome to JavaClass");

        System.out.print("Return Value :");
        System.out.println(Str105.replace('o', 'T'));

        System.out.print("Return Value :");
        System.out.println(Str105.replace('l', 'D'));
        System.out.println();

        //17 String replaceAll() Method - This method replaces each substring of this string that matches the
        // given regular expression with the given replacement.
        System.out.println("17 String replaceAll() Method");
        String Str106 = new String("Welcome to JavaClass");
        System.out.println();


        //18. String replaceFirst() Method - This method replaces the first substring of this string that matches
        // the given regular expression with the given replacement.
        System.out.println("18. String replaceFirst() Method");
        System.out.print("Return Value :");
        System.out.println(Str106.replaceAll("(.*)Java(.*)", "COOL"));
        System.out.println();

        //19. String split() Method - This method has two variants and splits this string around matches of the
        // given regular expression.
        System.out.println("19. String split() Method");
        String Str107 = new String("Welcome-to-JavaClass");
        System.out.println("Return Value :" );

        for (String retval10: Str107.split("-"))
            System.out.println(retval10);
        System.out.println();


        //20. String startsWith() Method - This method has two variants and tests if a string starts with the specified
        // prefix beginning a specified index or by default at the beginning.
        System.out.println("20. String startsWith() Method");
        String Str109 = new String("Welcome to JavaClass");

        System.out.print("Return Value :" );
        System.out.println(Str109.startsWith("Welcome") );

        System.out.print("Return Value :" );
        System.out.println(Str109.startsWith("Java") );
        System.out.println();

        //21. String startsWith(String prefix, int toffset) - This method has two variants and tests if a string starts
        // with the specified prefix beginning a specified index or by default at the beginning.
        System.out.println("21. String startsWith(String prefix, int toffset)");
        String Str110 = new String("Welcome to Java");

        System.out.print("Return Value :" );
        System.out.println(Str110.startsWith("Tutorials", 11) );
        System.out.println();

        //22. String subSequence() Method - This method returns a new character sequence that is a subsequence of
        // this sequence.
        System.out.println("22. String subSequence() Method");
        String Str111 = new String("Welcome to JavaClass");

        System.out.print("Return Value :" );
        System.out.println(Str111.subSequence(0, 10) );

        System.out.print("Return Value :" );
        System.out.println(Str111.subSequence(10, 15) );
        System.out.println();

        //23. String substring() Method - This method has two variants and returns a new string that is a substring of
        // this string. The substring begins with the character at the specified index and extends to the end of this
        // string or up to endIndex – 1, if the second argument is given.
        System.out.println("23. String substring() Method");
        String Str112 = new String("Welcome to my Java Class");

        System.out.print("Return Value :" );
        System.out.println(Str112.substring(10) );
        System.out.println();


        //24. String substring(beginIndex, endIndex) - This method has two variants and returns a new string that is a
        // substring of this string. The substring begins with the character at the specified index and extends to the
        // end of this string or up to endIndex – 1, if the second argument is given.
        System.out.println("24. String substring(beginIndex, endIndex)");
        String Str113 = new String("Welcome to my Java Class");

        System.out.print("Return Value :" );
        System.out.println(Str113.substring(10, 15) );
        System.out.println();

        //25. String toCharArray() Method - This method converts this string to a new character array.
        System.out.println("25. String toCharArray() Method");
        String Str114 = new String("Welcome to my Java Class");

        System.out.print("Return Value :" );
        System.out.println(Str114.toCharArray() );
        System.out.println();


        //26. String toLowerCase() Method - This method has two variants. The first variant converts all of the
        // characters in this String to lower case using the rules of the given Locale. This is equivalent to
        // calling toLowerCase(Locale.getDefault()).
        //
        //The second variant takes locale as an argument to be used while converting into lower case.
        System.out.println("26. String toLowerCase() Method");
        String Str115 = new String("Welcome to my Java Class");

        System.out.print("Return Value :");
        System.out.println(Str115.toLowerCase());
        System.out.println();

        //27. String toString() Method - This method returns itself a string.
        System.out.println("27. String toString() Method");
        String Str116 = new String("Welcome to my Java Class");

        System.out.print("Return Value :");
        System.out.println(Str116.toString());
        System.out.println();

        //28. String toUpperCase() Method - This method has two variants. The first variant converts all of the
        // characters in this String to upper case using the rules of the given Locale. This is equivalent to calling
        // toUpperCase(Locale.getDefault()).
        //
        //The second variant takes locale as an argument to be used while converting into upper case.
        System.out.println("28. String toUpperCase() Method");
        String Str117 = new String("Welcome to my Java Class");

        System.out.print("Return Value :" );
        System.out.println(Str117.toUpperCase() );
        System.out.println();

        //29. String trim() Method - This method returns a copy of the string, with leading and trailing
        // whitespace omitted.
        System.out.println("29. String trim() Method");
        String Str118 = new String("   Welcome to my Java Class   ");

        System.out.print("Return Value :" );
        System.out.println(Str118.trim() );
        System.out.println();


        //30. String valueOf() Method - This method returns the string representation.
        System.out.println("30. String valueOf() Method");
        double d = 102939939.939;
        boolean e = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

        System.out.println("Return Value : " + String.valueOf(d) );
        System.out.println("Return Value : " + String.valueOf(e) );
        System.out.println("Return Value : " + String.valueOf(l) );
        System.out.println("Return Value : " + String.valueOf(arr) );

    }
}
