package PROM_12951;

public class Solution {

    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char target = s.charAt(i);
            String toUpperCase = String.valueOf(target).toUpperCase();

            if(i == 0){
                if(Character.isLowerCase(target)){
                    sb.append(toUpperCase);
                }else{
                    sb.append(target);
                }
            }else if(s.charAt(i-1) == ' ' && Character.isLowerCase(target)){
                sb.append(toUpperCase);
            }
            else{
                sb.append(target);
            }

        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args){
        System.out.println(new Solution().solution("3people unFollowed me"));
        System.out.println(new Solution().solution("for the last week"));
        System.out.println(new Solution().solution("for the  last week"));

    }
}
