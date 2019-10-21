package NumberofRecentCalls933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName RecentCounter
 * @Description https://leetcode-cn.com/problems/number-of-recent-calls/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/21 9:46
 * @Version 1.0
 */
class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}
