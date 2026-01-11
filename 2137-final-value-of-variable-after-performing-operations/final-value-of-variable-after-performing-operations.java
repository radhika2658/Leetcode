class Solution {
    public int finalValueAfterOperations(String[] operations) {
        //  String operations[] ={"--X","X++","X++", "x++","x++"};
        int X = 0;
        
        for (int i = 0; i <operations.length; i++)
        {
            if (operations[i].charAt(1) =='+')
            {
            X++;
            }
            else 
            {
            X--;
            }
            
        }
        return X;
        
    }
}