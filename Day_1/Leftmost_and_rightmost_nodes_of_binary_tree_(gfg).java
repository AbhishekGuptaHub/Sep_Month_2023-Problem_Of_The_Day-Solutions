class Tree
{
    public static void printCorner(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(null);
        queue.add(root);
        queue.add(null);
        
        while (!queue.isEmpty())
        {
            Node currNode = queue.remove();
            
            if (currNode == null)
            {
                continue;
            }
            
            Node leftNode = currNode, rightNode = null;
            
            if (currNode != null)
            {
                Node prev = null;
                
                while (currNode != null)
                {
                    if (currNode.left != null)
                    {
                        queue.add(currNode.left);
                    }
                    
                    if (currNode.right != null)
                    {
                        queue.add(currNode.right);
                    }
                    
                    prev = currNode;
                    currNode = queue.remove();
                }
                
                rightNode = prev;
                
                System.out.print(leftNode.data + " ");
                
                if (rightNode != leftNode)
                {
                    System.out.print(rightNode.data + " ");
                }
                
                queue.add(null);
            }
        }
    }
}
