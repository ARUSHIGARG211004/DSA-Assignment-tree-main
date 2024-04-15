import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Q = scanner.nextInt();
        boolean isBlack = true;
        
        for (int i = 0; i < Q; i++) {
            String query = scanner.next();
            
            if (query.equals("Qi")) {
                isBlack = !isBlack; // Toggle color
            } else {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (query.equals("Qb")) {
                    System.out.println(countNodes(x, y, isBlack));
                } else if (query.equals("Qr")) {
                    System.out.println(countNodes(x, y, !isBlack));
                }
            }
        }
        
        scanner.close();
    }
    
    static int countNodes(int x, int y, boolean color) {
        int count = 0;
        while (x != y) {
            if (color) count++;
            x /= 2;
            y /= 2;
        }
        if (color) count++;
        return count;
    }
}
