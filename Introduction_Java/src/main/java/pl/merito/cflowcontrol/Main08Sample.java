package pl.merito.cflowcontrol;

public class Main08Sample {

	public static void main(String[] args) {
	    //definition of a variable with number of rows and asterisks in a row
	    int n = 5;

	    //creating a loop which will generate our ROWS
	    for (int i = 0; i < n; i++) {
	        String row = "";//a variable that is reset at the beginning of each iteration, storing the asterisks of a row

	        //creating a loop that generates asterisks in a row
	        for (int j = 0; j < n; j++) {
	            row += "*";
	        }
	        System.out.print(row + "\n");//display asterisks from a row and add a newline character
	    }
	}

}
