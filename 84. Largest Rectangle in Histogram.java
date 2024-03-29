class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            int currHt = heights[i];
            int start = i;

            while(!stack.isEmpty() && (stack.peek().getValue() > currHt)){
                Pair<Integer, Integer> pair = stack.pop();
                int index = pair.getKey();
                int h = pair.getValue();
                area = Math.max(area, h * (i - index));
                start = index;
            }

            stack.push(new Pair(start, currHt));
        }

        while(!stack.isEmpty()){
            Pair<Integer, Integer> pair = stack.pop();
            int index = pair.getKey();
            int h = pair.getValue();
            area = Math.max(area, h * (n - index));
        }

        return area;
    }
}