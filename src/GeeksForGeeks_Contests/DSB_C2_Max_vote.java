/**
 * Problem Statement
 * Given an array of type string containing names of candidates for whom the vote has been casted.
 * If the vote count for two candidates is same then the candidate with lexiographically smaller name is
 * declared the winner
 */





package GeeksForGeeks_Contests;

import java.util.HashMap;
import java.util.Map;

public class DSB_C2_Max_vote {
    public static String TieBreak(String votes[], int n)
    {
        // Insert all votes in a hashmap
        Map<String, Integer> map
                = new HashMap<String, Integer>();
        for (String str : votes) {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }

        // Traverse through map to find the candidate
        // with maximum votes.
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap) {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick lexicographically
            // smaller.
            else if (val == maxValueInMap
                    && winner.compareTo(key) > 0)
                winner = key;
        }
        return winner;
    }
}
