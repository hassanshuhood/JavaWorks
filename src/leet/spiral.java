package work.src.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiral {
    

    public static void main(String[] args) {
        int[] a = {1,2,3};
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix = {{1,2}};
        //int[][] matrix = {{1},{2},{3}};
        spiralOrder(matrix);

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        
        int iStart =0;
        int iEnd = matrix.length-1;
        int jStart = 0;
        int jEnd = matrix[0].length-1;

        listParameter(spiral,matrix,iStart,iEnd,jStart,jEnd);
        System.out.println(spiral);
        return spiral;
    }
    
    private static void listParameter(List<Integer> spiral,int[][] matrix,int iStart,int iEnd,int jStart,int jEnd){

        int i = iStart;
        int j = jStart;
        boolean updated = false;
        while( j<= jEnd ){
            updated = true;
            spiral.add(matrix[i][j]);
            j++;
        }
        j = jEnd;
        i = iStart + 1;
        if(!updated )
            return;
        updated = false;
        while(i <= iEnd){
            updated = true;
            spiral.add(matrix[i][j]);
            i++;
        }
        if(!updated )
            return;
        updated = false;
        i = iEnd;
        j = jEnd -1;
        while(iEnd != iStart && j >= jStart){
            updated = true;
            spiral.add(matrix[i][j]);
            j--;
        }
        if(!updated )
            return;
        updated = false;

        j = jStart;
        i = iEnd - 1;
        while(  i >= iStart +1){
            updated = true;
            spiral.add(matrix[i][j]);
            i--;
        }
        if(!updated )
            return;
        updated = false;
        iStart++;
        iEnd--;
        jStart++;
        jEnd--;
        if(iStart <= iEnd && jStart <= jEnd)
            listParameter(spiral, matrix, iStart, iEnd, jStart, jEnd);
        
    }
}
