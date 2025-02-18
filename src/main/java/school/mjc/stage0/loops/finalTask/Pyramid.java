package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 0; i < cathetusLength; i++) {
            int counter = cathetusLength;
            for (int j = 0; j < cathetusLength + i; j++) {
                if (j < cathetusLength - i - 1 || j > cathetusLength + i - 1) {
                    System.out.print(' ');
                } else {
                    System.out.print(counter);
                }
                counter = j < cathetusLength - 1 ? counter - 1 : counter + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
