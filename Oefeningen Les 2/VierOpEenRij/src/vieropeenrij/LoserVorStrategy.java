package vieropeenrij;

import java.util.Observer;

public class LoserVorStrategy implements VorStrategy{
    private int[] $loserMatrix = {0,0,0,0,0,0,0};
    @Override
    public int doMove(VorMatrix vMatrix) {
        int column = 0;
        int partial = 0;
        int partial2 = 0;
        do{
            partial = (int) (2 * Math.random()) % VierOpEenRij.COLS;
            partial2 = (int) (3 * Math.random()) % VierOpEenRij.COLS;
            if (partial == 1){
                column = partial2+4;
            }
            if (partial == 0) {
                column = partial2;
            }
        }while(vMatrix.getFill(column,VierOpEenRij.ROWS-1) != VierOpEenRij.FILL.EMPTY && !willWin(column));
        $loserMatrix[column]++;
        return column;
    }
    private boolean willWin(int column){
        return $loserMatrix[column] == 3;
    }
}
