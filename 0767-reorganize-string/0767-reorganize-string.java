class Solution {
    class Pair {
        int first;
        char second;

        Pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }

    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
            PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.first - a.first);
            for(char ch : map.keySet()){
                pq.offer(new Pair(map.get(ch),ch));
            }
            char[] res = new char[s.length()];
            int seat = 0;
            while (!pq.isEmpty()) {
            Pair p1 = pq.poll();
                if (seat == 0 || res[seat - 1] != p1.second) {
                    res[seat] = p1.second;
                    seat++;
                    p1.first--;
                    if (p1.first > 0) {
                        pq.offer(p1);
                    }

                } else {
                    if (pq.isEmpty()) {
                        return "";
                    }
                    Pair p2 = pq.poll();
                    res[seat] = p2.second;
                    seat++;
                    p2.first--;
                    if (p2.first > 0) {
                        pq.offer(p2);
                    }
                    pq.offer(p1);

                }
            }
            return new String(res);
        

    }
}