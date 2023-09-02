class Solution
{
    static void findCosts(Node root, ArrayList<Integer> costs, int cost)
    {
        if (root == null)
        {
            return;
        }
        
        cost++;
        
        if (root.left == null && root.right == null)
        {
            costs.add(cost);
        }
        
        findCosts(root.left, costs, cost);
        findCosts(root.right, costs, cost);
    }
    
    public int getCount(Node root, int bud)
    {
        ArrayList<Integer> costs = new ArrayList<>();
        
        findCosts(root, costs, 0);
        
        Collections.sort(costs);
        
        int totalCost = 0, count = 0;
        
        for (int ele : costs)
        {
            totalCost += ele;
            
            if (totalCost <= bud)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        
        return count;
    }
}
