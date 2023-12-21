package advance.Exeception;

public class Tree {
    public static void main(String[] args) {
        String tree = "Pine";
        int size = 0;
        boolean flag = true;

        if (tree.equals("Pine")) {
            size = 10;
        }
        else if (tree.equals("Oak")) {
            size = 20;
        }
        else if (tree.equals("Maple")) {
            size = 30;
        }
        else {
            flag = false;
        }

        while (flag) {
            System.out.println("The size of the tree is " + size);
            flag = false;
        }
    }
}
