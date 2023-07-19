import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private Node root;
    // empty tree constructor
    public Tree(){
        root=null;
    }
    public Tree(Empleado emp){
        root=new Node(emp,null,null);
    }

    private void insertRec(Node newNode,Node actual){
        if(newNode.getEmp().getCode()<actual.getEmp().getCode()){
            if(actual.getLeft()!=null){
                insertRec(newNode,actual.getLeft());
            }else{
                actual.setLeft(newNode);
            }
        }else{
            if (actual.getRight() != null) {
                insertRec(newNode, actual.getRight());
            } else {
                actual.setRight(newNode);
            }
        }
    }


    public void insert(Empleado emp){
        if(root==null){
            root=new Node(emp,null,null);
        }else{
            insertRec(new Node(emp,null,null),root);
        }
    }

    private String preOrderRec (Node node){
        if(node!=null){
            return node.getEmp().toString()+preOrderRec(node.getLeft())+preOrderRec(node.getRight());
        }
        return "";
    }
       private  String inOrderRec (Node node){
        if(node!=null){
            return preOrderRec(node.getLeft())+node.getEmp().toString()+preOrderRec(node.getRight());
        }
        return "";
            }
    private String postOrderRec (Node node){
        if(node!=null){
            return preOrderRec(node.getLeft())+preOrderRec(node.getRight())+node.getEmp().toString();
        }
        return "";
    }



    public String preOrder(){
        if(root==null){
            return("No existe nada de elementos");
        }else{
            return (preOrderRec(root));
        }
    }
    public String inOrder(){
        if(root==null){
            return("No existe nada de elementos");
        }else{
            return (inOrderRec(root));
        }
    }
    public String postOrder(){
        if(root==null){
            return("No existe nada de elementos");
        }else{
            return (postOrderRec(root));
        }
    }

    public Queue<Node> recorridoNiveles (){
        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        Node aux = null;
        queue1.add(root);
        while (!queue1.isEmpty()){
            aux = queue1.poll();
            if (aux.getLeft()!=null){
                queue1.add(aux.getLeft());
            }
            if (aux.getRight()!=null){
                queue1.add(aux.getRight());
            }
            queue2.add(aux);
        }
        return queue2;
}

public double sumSalary(){
    double salario=0;
    for(Node node:recorridoNiveles()){
        salario+=node.getEmp().getSalary();
    }
    return salario;
}
}
