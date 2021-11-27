package ReorderDataLogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderDataLogsTest {
    public static void main(String[] args){
        //using double brace initialization
        /*List<String> logs = new ArrayList<String>(){{
            add("dig1 8 1 5 1");
            add("let1 art can");
            add("dig2 3 6");
            add("let2 own kit dig");
            add("let3 art zero");
        }};
        System.out.println(logs.toString());

        */
        //or can create a string array and initialize in place
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] solution = {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
        ReorderDataLogsImpl reorderDataLogs = new ReorderDataLogsImpl();
        System.out.println(Arrays.toString(reorderDataLogs.reorderLogFiles(logs)));
        System.out.println(Arrays.toString(solution));
        //need to parse each string and determine if it is a letter-log or a digits log and then sort

    }
}
