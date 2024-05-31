package arrays2d;

// import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        // Scanner sc = new Scanner(System.in);
        int c=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=c++;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();

        int startrow = 0;
        int startcol = 0, endrow = arr.length - 1, endcol = arr[0].length - 1;
        while (startcol <= endcol && startrow <= endrow) {
            for (int top = startcol; top <= endcol; top++) {
                System.out.print(arr[startrow][top] + " ");
            }
            for (int right = startrow + 1; right <= endrow; right++) {
                System.out.print(arr[right][endcol] + " ");
            }
            for (int bottom = endcol - 1; bottom >= startcol; bottom--) {
                System.out.print(arr[endrow][bottom] + " ");
            }
            for (int left = endrow - 1; left >= startrow + 1; left--) {
                System.out.print(arr[left][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
}
