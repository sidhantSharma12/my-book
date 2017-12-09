//This problem asks to return the longest palindrome substring in a string.
//There are 2n-1 centres to expand from. This is 2n-1 and not n because the centre of a palindrome might include or not include a character.
//ex)"abbc" => Centre is middle of the two b's
//ex)"aba" => Centre is a
public String Palindrome(String s) {
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandTheCenter(s, i, i);
        int len2 = expandTheCenter(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandTheCenter(String s, int left, int right) {
    int Left = left, Right = right;
    while (Left >= 0 && Right < s.length() && s.charAt(Left) == s.charAt(Right)) {
        Left--;
        Right++;
    }
    return Right - Left - 1;
}
