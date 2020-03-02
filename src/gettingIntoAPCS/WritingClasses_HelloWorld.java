/*
 * This is called a package, which can be thought of as a subfolder containing the different classes
 * that you will be writing. All names of classes, pacakges, variables, etc. should always be 
 * relevant to what you are trying to accomplish. I named this package gettingIntoAPCS because 
 * this package is dedicated to showing what you need to skip Intro to Computer Science. 
 */
package gettingIntoAPCS;

/*
 * In this space is where you will import other packages that are not accessible by default. Things
 * like formatting and getting user input will be displayed here. You will see more of how this works 
 * later on.
 */


/*
 * Classes always begin with public class, meaning that it is a class that can be accessed by anything.
 * Without the public keyword, this class could not be used at all. After class comes what you are going
 * to name it. I named it WritingClasses_HelloWorld because this class is dedicated towards teaching you
 * how to write a class and display hello world in the console. (The console appears when you run a 
 * program).
 */

public class WritingClasses_HelloWorld { //<--Brackets indicate the body of something (this is the body of a class).

/*
 * For now, let's say that every class should being with the following words (called syntax) below. We will
 * get more into this later on, but just know that this is how every program should start. Without this, 
 * Java would not know where you are trying to start the program from and will throw an error.
 */
	
	public static void main(String[] args) {
/*   |=====================|  |================================| 
 *   |   System refers to  |  | println means it is going      |
 *   |  the program itself |  | to print what you put in       |
 *   |                     |  | the following quotes, followed | 
 *   |=====================|  | by a new line.                 |
 *         |                  |================================|        
 *         |  |=================|     |                  |============================================================|
 *         |  |out means it is  |     |                  |  Using print instead of println will just print what you   |
 *         |  |displaying to the|     |                  |  want without a new line after it. For example:            |
 *         |  |console          |     |                  |                                                            |
 *         |  |=================|     |                  |   System.out.print("Hello");                               |
 *         |      |                   |                  |   System.out.print("World");                               |
 *         |      |     --------------|                  |                                                            | 
 *         |      |     |                                | will print HelloWorld.                                     |
 *         |      |     |                                |============================================================|
 */                           
		System.out.println("Hello World"); //<--Every statement always ends with a semicolon (;)   
		
		//If you run this program by clicking the green triangle at the top left of your screen, it prints Hello World.

	}

}
