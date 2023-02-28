package HarmonikOrt;

public class transpose {
    public static void main(String[] args) {

        int[][] matris= new int[2][3];
        matris[0][0]=2;
        matris[0][1]=4;
        matris[0][2]=5;
        matris[1][0]=3;
        matris[1][1]=1;
        matris[1][2]=6;

        int[][] transpose= new int[3][2];
        for(int i=0; i< matris.length ; i++){
            for(int j=0; j<matris[i].length ; j++){
                transpose[j][i]=matris[i][j];

            }

        }
        for(int a=0; a< transpose.length ; a++){
            for(int b=0; b<transpose[a].length ; b++){
                System.out.print(transpose[a][b]+" ");
            }
            System.out.println();
        }


    }
}
