package BFS;
import java.util.*;

public class rightorleft{
    static List<Integer>left=new LinkedList<>();
    static List<Integer>right=new LinkedList<>();
    public static void order(Tree root)
    {
        
        if(root==null)
        {
            return;
        }
        Queue<Tree>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                Tree node=q.poll();
                if(i==0)
                {
                    left.add(node.v);
                }
                if(i==l-1)
                {
                    right.add(node.v);
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

    }
    public static void main(String[] args) {
        Inorder n= new Inorder();
        Tree t= new Tree();
        n.inter();
        t.inorderdisplay(n.root);
        order(n.root);
        System.out.println(left);
        System.out.println(right);
    }
}