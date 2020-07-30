package BFS;

import java.util.*;

public class reverselevel{
    public static List<List<Integer>> order(Tree root)
    {
        List<List<Integer>>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
        Queue<Tree>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer>x=new LinkedList<>();
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                Tree node=q.poll();
                x.add(node.v);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            li.add(0,x);
        }
        return li;

    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        Tree t= new Tree();
        n.inter();
        t.inorderdisplay(n.root);
        System.out.println(order(n.root));
    }
}