package BFS;

public class Inorder {
    Tree root;
    public  void inter() {
        int arr[]={20,40,50,10,60,55,70,80};
        Tree t=new Tree();
        for(int i=0;i<arr.length;i++)
        {
            t.insert(arr[i]);
        }
        root=t.root;
        // t.inorderdisplay(t.root);

    }
}