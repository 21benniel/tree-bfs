package BFS;

import java.util.*;

public class successor{
    public static int order(Tree root,int k)
    {
        
        if(root==null)
        {
            return 0;
        }
        Queue<Tree>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            
            
                Tree node=q.poll();
                
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            if(node.v==k)
            {
                break;
            }
            
            
        }
        return q.poll().v;
    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        // Tree t= new Tree();
        n.inter();
        // t.inorderdisplay(n.root);
        System.out.println(order(n.root,60));
    }
}