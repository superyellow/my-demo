package bst;

/**
 * 实现一个二叉查找树,实现插入、查找、删除
 *
 * @author simple_huang@foxmail.com on 2017/12/4.
 */
public class BST {
    private static TreeNode root;
    private static boolean LEFT = true;
    private static boolean RIGHT = false;

    public BST() {
        root = null;
    }

    /**
     * 二叉查找树的查找方法
     * 1. 从root开始
     * 2. 将查找的值与当前节点value比较
     * 3. 等于则返回这个节点, 小于则来到左子节点, 大于则来到右子节点
     *
     * @param target
     * @return
     */
    public TreeNode search(int target) {
        TreeNode current = root;
        while (current != null && current.getValue() != target) {
            if (target < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return current;
    }

    /**
     * 二叉查找树的插入方法
     * 一、 1. 从root开始
     *     2. 判断root是否为空, 空则直接插入新节点并返回
     * 二、 1. root非空
     *     2. 将要插入的值与当前节点value比较
     *     3. 大于等于则来到右节点, 小于来到左节点
     *     4. 如果当前节点为空, 则插入当前节点
     *     5. 当前节点不为空, 从2再来
     *     6. parent用来记录整个树的状态
     *
     * @param newValue
     * @return
     */
    public TreeNode insert(int newValue) {
        TreeNode current = root;
        TreeNode parent = null;
        TreeNode newNode = new TreeNode(newValue);
        if (current == null) {
            return root = newNode;
        }

        boolean mark = true;
        while (current != null) {
            if (newValue < current.getValue()) {
                parent = current;
                current = current.getLeft();
                mark = LEFT;
            } else {
                parent = current;
                current = current.getRight();
                mark = RIGHT;
            }
        }

        if (mark) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
        return newNode;
    }

    /**
     * 删除某个值
     *
     * @param delValue
     * @return
     */
    public TreeNode delete(int delValue) {
        return null;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        System.out.println(tree.search(1)==null?null:tree.search(1).getValue());
    }
}
