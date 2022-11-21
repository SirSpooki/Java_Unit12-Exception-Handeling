// An employee ID can't be more than 999

// Keep executing until user enters four valid employee IDs

// This program throws a FixDebugEmployeeIDException

import java.util.*;

public class DebugTwelve4

{

public static void main(String[] args)

{

Scanner input = new Scanner(System.in);

String inStr, outString = "";

final int MAX = 999;

int[] emps = new int[4];

//for(x = 0; x < emps.length; ++x)

/* The variable used within the for loop

* should have a datatype */

for(int x = 0; x < emps.length; ++x)

{

System.out.println("Enter employee ID number");

inStr = input.next();

//throw

/* Try instead of throw. A try statement is used to

* catch an exception, whereas the throw keyword is

* used to explicitly throw an exception */

try

{

emps[x] = Integer.parseInt(inStr);

if(emps[x] > MAX)

{

//throw(new FixDebugEmployeeIDException("Number too high "

// + emp[x]));

/* The name for the exception class is

* DebugEmployeeIDException.java

* The variable name for int array is emps */

throw(new DebugEmployeeIDException("Number too high "

+ emps[x]));

}

}

catch(NumberFormatException error)

{

--x;

System.out.println(inStr + "\nNonnumeric ID");

}

//catc(FixDebugEmployeeIDException error)

/* The keyword is catch and the name of the

* exception class is DebugEmployeeIDException */

catch(DebugEmployeeIDException error)

{

--x;

//System.out.println(");

/* This will print the error that is thrown to

* DebugEmployeeIDException() class */

System.out.println(error.getMessage());

}

}

for(int x = 0; x < emps.length; ++x)

{

//outString = outString + empss[x] + " ";

/* The variable name for int array is emps */

outString = outString + emps[x] + " ";

}

System.out.println("Four valid IDS are: " + outString);

}

}
