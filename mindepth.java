package BFS;

import java.util.*;

public class mindepth{
    public static int order(Tree root)
    {
        // List<Integer>li=new ArrayList<>();
        if(root==null)
        {
            return 0;
        }
        Queue<Tree>q=new LinkedList<>();
        q.offer(root);
        int depth=0;
        while(!q.isEmpty())
        {
            depth++;
            
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                Tree node=q.poll();
                if(node.left==null && node.right==null)
                {
                    return depth;
                }
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            
        }
        return depth;
    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        Tree t= new Tree();
        n.inter();
        t.inorderdisplay(n.root);
        System.out.println(order(n.root));
    }
}