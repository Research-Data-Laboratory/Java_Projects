/**
 * @author Lars
 * @version 0.0.1
*/

/*    TODO:
*
*/

import createfile.templates.*;
public class Main {
    public static void main (String[] args) {
        final String[] headlineLow = {"\nc","r","e","a","t","e"," a ", "f","i","l","e\n"};
        final String headlineChar = "-";

        boolean loopExit = false;

        while (!loopExit) {
            for (String i_OfHeadline : headlineLow) { // for-each loop
                SleepTimer.sleepTimer();
                System.out.print(i_OfHeadline.toUpperCase());
            }
            for (var i = 0; i < 11; i++) {
                SleepTimer.sleepTimer();
                System.out.print(headlineChar);
            }
            Create.create();
            //SearchPattern.searchPattern();
            Write.write();
            Read.read();
        }
    }
}
