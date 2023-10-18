class Solution {
    public int[] solution(int money) {
        final int price = 5500;
        int quot = money/price;
        int remain = money%price;
        int[] answer = new int[]{quot,remain};
        
        return answer;
    }
}