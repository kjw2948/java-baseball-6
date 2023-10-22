package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class InputMyNum {
    public List<Integer> inputNum(){
        String playerNumString = Console.readLine();
        List<Integer> playerNum = new ArrayList<>();
        for(String number : playerNumString.split("")){
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}
