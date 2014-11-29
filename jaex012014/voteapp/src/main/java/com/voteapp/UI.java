package com.voteapp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner; 
/**
 * 
 * @author Link Student
 * @version 1.0
 * @see SQLException
 */
public class UI {
    /**
     * 
     * @throws SQLException 
     */
    public UI() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Who do you prefer?");
        Dao dao = new Dao();
        dao.connect();
        for(Object entry : dao.questions.entrySet()){
             Map.Entry question = (Map.Entry)entry;
             System.out.print(question.getValue() + ":" + question.getKey()+" ");
        }
        int answer = scanner.nextInt(); 
        dao.addAnswer(username,answer);
        ArrayList counts = dao.getAnswersCount();
        for(Object answer_object : counts){
            Integer[] ans = (Integer[])answer_object;
            System.out.println(dao.questions.get(ans[1].toString())+" "+ans[0]);
        }
        dao.disconnect();
    }
}
