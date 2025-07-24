package Day09;

public class Solution1732 {
    public int largestAltitude(int[] gain) {
    int current = 0, highest = 0;

    for (int g : gain) {
        current += g;
        highest = Math.max(highest, current);
    }

    return highest;
}

}
