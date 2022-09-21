package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int completeLength = cathetusLength*2-1;
        for(int i=0;i<cathetusLength;i++){
            for (int j=0;j<completeLength;j++){
                if(j<=completeLength/2+i && j>=completeLength/2-i) System.out.print(Math.abs(j-completeLength/2)+1);
                else if(j<completeLength/2) System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
