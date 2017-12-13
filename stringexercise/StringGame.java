package stringexercise;

/**This class will demonstrates String class methods.
 * @author Mehzabin Akhter
 * @version 1.0
 *
 */
public class StringGame {
    public static void main(String[] args) {
        String sentance1="  String is not a primitive type";
        String str1="Core java";
        String str2="Selenium";
        String str3=new String("Framework");
        String [] pnt_course={"SDLC","ALM","CNSS","Selenium"};
        String sentence2 ="java is my favourite programming language";
        String name1="wonder woman";
        String name2="super women";


        System.out.println("third charecter of name1 is "+ name1.charAt(3));  // # 1; This is demonstration of charAt method, which takes a index as a parameter and return the char value in specified index.

        System.out.println("before swap name1:"+name1+" name2 :" + name2);//#2 this line simply prints name1 and name2 value on screen
        System.out.println("index of favourite "+ sentence2.indexOf("favourite")); //#3 Returns the index within this string of the first occurrence of the specified character.

        String temp;          // this code will swap two strings name1 and name2.
        temp=name1;
        name1=name2;
        name2=temp;
        System.out.println("after swap name1: "+name1+" name2 :"+ name2);// this line will print name1 and name2 after swaping

        System.out.println(sentance1);
       System.out.println(sentance1.length()); //this line will returns the length of string "sentence1"
        System.out.println(sentance1.charAt(5));
        System.out.println(sentance1.concat(", String is a java object"));// Concatenates sentance1 string to the end of this string.
        System.out.println(sentance1.codePointAt(0));     //Returns the number of Unicode code points in the specified text range of this String.
        System.out.println(sentance1.codePointBefore(4));  //Returns the character (Unicode code point) before the specified index.
        System.out.println(str1.compareTo("Core java"));       //Compares two strings lexicographically.
        System.out.println(str1.compareTo("core java"));

        System.out.println(str1.compareToIgnoreCase("core java")); //Compares two strings lexicographically, ignoring case differences.
        System.out.println(sentance1.contains("primitive"));        //Returns true if and only if this string contains the specified sequence of char values.
        System.out.println(sentance1.contains("Core"));
        System.out.println(str1.contentEquals("Core java"));   //Compares this string to the specified CharSequence.
        System.out.println(str1.codePointCount(0,5));       //Returns the number of Unicode code points in the specified text range of this String.
        System.out.println(sentance1.endsWith("not"));    //Tests if this string ends with the specified suffix.
        System.out.println(sentance1.equals(str1));      //Compares this string to the specified object.
        System.out.println(sentance1.substring(10));    //Returns a new string that is a substring of this string.
        System.out.println(sentance1.substring(0,6));  //Returns a new string that is a substring of this string.
        System.out.println(str2.isEmpty());       //Returns true if, and only if, length() is 0.
        System.out.println(sentance1.lastIndexOf("primitive"));   //Returns the index within this string of the last occurrence of the specified character.
        System.out.println(sentance1.toLowerCase());       //Converts all of the characters in this String to lower case using the rules of the default locale.
        System.out.println(str1.toUpperCase());        //Converts all of the characters in this String to upper case using the rules of the default locale.
        System.out.println(sentance1.replace("String","Array")); //Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
        System.out.println(" string with leading and trailing white space removed by trim method:"+ sentance1.trim()); //Returns a copy of the string, with leading and trailing whitespace omitted.
        System.out.println(str3.toCharArray());    //Converts this string to a new character array.
        
        System.out.println(pnt_course.length);
        System.out.println(pnt_course.hashCode());  //Returns a hash code for this string.
        for (int i=0;i<pnt_course.length;i++) {          // for loop which will loop throw the array and print the contents of the array.
            System.out.println( "course Name: "+ pnt_course[i]);
        }
        System.out.println(str2.indexOf("l"));  //Returns the index within this string of the first occurrence of the specified character.
        System.out.println(sentance1.replaceAll("String "," Automation")); //Replaces each substring of this string that matches the given regular expression with the given replacement.



    } // main method end
} // StringGame class end
