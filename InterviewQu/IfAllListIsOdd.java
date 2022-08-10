package InterviewQu;

import java.util.List;

public class IfAllListIsOdd {
    // Write a method that checks  if the given
    // list is containing only odd numbers
    public boolean ifTHeAllListIsOdd(List<Integer> nums){
        for (int i=0;i<nums.size();i++){
            if (nums.get(i)%2==0){
                return false;
            }
        }
        return true;
    }
}
