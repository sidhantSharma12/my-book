//input: "23", output: all possible combination ["ad", "ae".....,"cf"]
public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){//peek checks the head of the list
            String t = ans.remove();//removes the head of the list
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);//adds it to the tail
        }
    }
    return ans;
}
