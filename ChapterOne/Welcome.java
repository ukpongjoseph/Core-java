// using "package ChapterOne" because the folder that holds this java file is a package and the package declaration is necessary, hence package ChapterOne
// To run code, cd into package directory and then run javac "filename".java and then finally java "filename".java
// For each package or folder, there can only be one public class
package ChapterOne;
// There can be only one public class per package/file

public class Welcome{
    public static void main(String[] args) {
       System.out.println("Welcome Jave"); 
       System.out.println("My first Java code"); 
       System.out.println(2 * 7);
    }
}