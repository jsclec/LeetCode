package ReorderDataLogs;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataLogsImpl {
    public String[] reorderLogFiles(String[] logs) {
        //construct a custom comparator, then use the Arrays.sort(array, comparator) syntax
        Comparator<String> myComp = new Comparator<>() {
            @Override
            public int compare(String log1, String log2) {
                //split method of String class, syntax: split(regex, int limit)
                //this gets the second word of the String, which is what defines it as letter log or digits log
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);
                //see whether the split substrings start with a char or a digit
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                //case 1: both logs are letter logs
                if (!isDigit1 && !isDigit2) {
                    int cmp = split1[1].compareTo(split2[1]);
                    if (cmp != 0)
                        return cmp;
                    return split1[0].compareTo(split2[0]);
                }

                //case 2: one is letter, other is not
                if (!isDigit1 && isDigit2) {
                    return -1;
                } else if (isDigit1 && !isDigit2) {
                    return 1;
                } else              //case3: neither is a letter log
                    return 0;
            }
        };

        Arrays.sort(logs, myComp);
        return logs;

    }
}
