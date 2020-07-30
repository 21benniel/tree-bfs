package BFS;

public class Tree {
    int v;
    Tree left,right,next;
    Tree(int v)
    {
        this.v=v;
        left=right=next=null;
    }
    Tree root;
    Tree()
    {
        root=null;
    }
    void insert(int v)
    {
        root=helper(root,v);

    }
    Tree helper(Tree root,int v)
    {
        Tree n= new Tree(v);
        if(root==null)
        {
            root=n;
            return root;
        }
        if(v<root.v)
        {
            root.left=helper(root.left,v);
        }
        else if(v>root.v)
        {
            root.right=helper(root.right,v);
        }
        return root;
    }
    void inorderdisplay(Tree root)
    {
        if(root!=null)
        {
            inorderdisplay(root.left);
            System.out.println(root.v);
            inorderdisplay(root.right);
        }
    }
}