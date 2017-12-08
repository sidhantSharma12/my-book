//permuation function takes two parameters where it sees if one of the string is a permutation of the other

public Boolean permutation(String input1, String input2){
	if(input1.length() != input2.length()){
		return false; 
	}

	String sortedInput1 = sort(input1);
	String sortedInput2 = sort(input2);
	return sortedInput1.equals(sortedInput2);
}

private String sort(String string){
	char[] charArray = string.toCharArray();
	Arrays.sort(charArray);
	return new String(charArray);
}

//Or check if they have identical character counts for a faster runtime.
