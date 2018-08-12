package designpattern.templatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class CoffeeWithHook extends CaffeeineBeverageWithHook {

    public void brew(){
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments()  {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n) ? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        if(answer == null)
            return "no";

        return answer;
    }
}
