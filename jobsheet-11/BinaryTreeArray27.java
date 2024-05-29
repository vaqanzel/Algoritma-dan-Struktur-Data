public class BinaryTreeArray27 {
    int [] data;
    int idxLast;

    public BinaryTreeArray27(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStar){
        if(idxStar<=idxLast){
            traverseInOrder(2*idxStar+1);
            System.out.print(data[idxStar] + " ");
            traverseInOrder(2*idxStar+2);
        }
    }
}
