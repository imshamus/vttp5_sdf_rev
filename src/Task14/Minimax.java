package Task14;

public class Minimax {

    public int calculateLevel(int n){

        // calculateLevel(8) = 1 + calculateLevel(4) 
        // calculateLevel(4) = 1 + calculateLevel(2)
        // calculateLevel(2) = 1 + calculateLevel(1)
        // calculateLevel(1) = 0
        
        // 1+1+1+0 = 3

        if (n==1)
        {
            return 0;
        }
        else
        {
            return 1 + calculateLevel(n/2);
        }

        // return (n==1) ? 0 : 1 + calculateLevel(n/2); // if n == 1 true, return 0, else return 1 + calculateLevel(n/2)
    }

    
    
    public int minimax(int currentDepth, boolean isMax, int values[], int currentNodeIndex, int depth)
    {
        // if current depth == 1 (top level), break out of recursive function, return final result

        // booolean isMax: determine if you're processing max or min (alternating)

        if (currentDepth == depth)
        {
            return values[currentNodeIndex];
        }

        if(isMax)
        {   System.out.println("Max-ing at depth: " + currentDepth);
           
            //call minimax function
            int maxEval = Math.max(
                minimax(currentDepth + 1, false, values, currentNodeIndex * 2, depth),      // left child
                minimax(currentDepth + 1, false, values, currentNodeIndex * 2 + 1, depth)   // right child
                ); 

            System.out.println("Max value at depth " + currentDepth + ": " + maxEval);
            return maxEval;
        }
        else
        {
            System.out.println("Mini-ing at depth: " + currentDepth);
           
            //call minimax function
            int minEval = Math.min(
                minimax(currentDepth + 1, true, values, currentNodeIndex * 2, depth),      // left child
                minimax(currentDepth + 1, true, values, currentNodeIndex * 2 + 1, depth)   // right child
                );

            System.out.println("Max value at depth " + currentDepth + ": " + minEval);
            return minEval;            
        }

        //Math.max & Math.min finds max and min btwn 2 values
    }
    
}
