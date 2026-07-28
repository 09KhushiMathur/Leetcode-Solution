import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        backtrack("", 0, 0, n, res);

        return res;
    }

    public void backtrack(
            String temp,
            int open,
            int close,
            int n,
            List<String> res
    ) {

        // Base case
        if (open == n && close == n) {
            res.add(temp);
            return;
        }

        // Opening bracket add karo
        if (open < n) {
            backtrack(
                temp + "(",
                open + 1,
                close,
                n,
                res
            );
        }

        // Closing bracket add karo
        if (close < open) {
            backtrack(
                temp + ")",
                open,
                close + 1,
                n,
                res
            );
        }
    }
}