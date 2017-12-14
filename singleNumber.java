//If one is given an array of intergers, where it is promised that every element
//is repeated twice except one, find that one non repeated element. 

//We know that Xor's is associative(the order does not matter). 

//a^b^a is the same as (a^a)^b = 0^b=b
//So we know that all elements will cancel each other out except one of them

 public int singleNumber(int[] nums) {    
        int result=0;
        for(int i=0; i<nums.length; i++){
            result ^=nums[i];
        }
        return result;
 }
