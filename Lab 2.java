public class Main {
    private int[][][] cube;
    private int size;
    
    
    public Main(int n) {
        if (n <= 3 || n % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd integer greater than 3");
        }
        this.size = n;
        this.cube = new int[n][n][n];
        fillCube();
    }
    
    
    private void fillCube() {
        int value = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }
    }
    
    
    public int[][][] getCube() {
        return cube;
    }
    

    public void printCubeAndCenter() {
        
        System.out.println("Cube Contents:");
        for (int i = 0; i < size; i++) {
            System.out.println("\nLayer " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.printf("%4d ", cube[i][j][k]);
                }
                System.out.println();
            }
        }
        
        
        int center = size / 2;
        System.out.println("\nCenter Element:");
        System.out.printf("Position [%d,%d,%d]: %d%n", 
            center, center, center, cube[center][center][center]);
    }
    
    public static void main(String[] args) {
    
        Main cube = new Main(5);
        cube.printCubeAndCenter();
    }
}
// 171369 Abdalla Zulekha Omar Musa 