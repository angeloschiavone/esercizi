package com.angelo.leetcode;

public class MinCostClimbingStairs
{
    public static void main(String[] args) {

        int result = minCostClimbingStairs(new int[]{1, 100, 10, 1, 1, 100, 1, 1, 100, 1,2,8},  -1);

        System.out.println("result "+result);
    }




    public static int minCostClimbingStairs(int[] cost, int index)
    {
        int sum = 0;

        if(index != -1)
            sum += cost[index];

        if(index+1 >= cost.length || index+2 >= cost.length )
            return sum;

        int oneStep = minCostClimbingStairs(cost, index+1);
        int twoStep = minCostClimbingStairs(cost, index+2);
        if(oneStep<twoStep)
        {
            sum += oneStep;
        }
        else
        {
            sum += twoStep;
        }
        return sum;
    }
}
