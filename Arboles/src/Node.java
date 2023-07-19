public class Node {
private Empleado emp;
private Node left;
private Node right;

public Node(){}
public Node(Empleado emp, Node left, Node right) {
    this.emp = emp;
    this.left = left;
    this.right = right;
}

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}

