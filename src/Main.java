public class Main {
    public static void main(String[] args) {
        //Задача 1,2
        System.out.println("Задача 1 и 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i == one.length - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();


        double[] two = {1.57, 7.654, 9.986};
        for (int o = 0; o < two.length; o++) {
            System.out.print(two[o]);
            if (o == two.length - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();


        double[] tree = {1.444, 4.494, 7.327, 5.472};
        for (int t = 0; t < tree.length; t++) {
            System.out.print(tree[t]);
            if (t == tree.length - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задача 3
        System.out.println("Задача 3");

        for (int i = one.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.println(one[i]);
            }
        }

        for (int i = two.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.println(two[i]);
            }
        }

        for (int i = tree.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(tree[i] + ", ");
            } else {
                System.out.println(tree[i]);
            }
        }

        //Задача 4
        System.out.println("Задача 4");


        for (int i = 0; i < one.length; i++) {
            if (i != one.length - 1) {
                if (one[i] % 2 != 0) {
                    one[i]++;
                    System.out.print((one[i]) + ", ");
                } else {
                    System.out.print(one[i] + ", ");
                }
            } else {
                if (one[i] % 2 != 0) {
                    one[i]++;
                    System.out.print((one[i]));
                } else {
                    System.out.print(one[i]);
                }
            }
        }
    }
}
