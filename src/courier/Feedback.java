package courier;

import java.util.*;
import java.io.*;

public class Feedback {
    //define the data attribute in Feedback
    private String feedbackID;
    private String rating;
    private String description;
    private String feedbackUser;
    
    private boolean isFilled;
  
    public Feedback(String FeedbackID, String Rating, String Description, String FeedbackUser) {
        //bring the data attribute into the variable
        feedbackID = FeedbackID;
        rating = Rating;
        description = Description;   
        feedbackUser = FeedbackUser;
    }
    
    private String getFeedbackid() {
        return feedbackID;
    }
    
    private String getRating() {
        return rating;
    }
    
    private String getDescription() {
        return description;
    }
    
    private String getFeedbackUser() {
        return feedbackUser;
    }
    
    public void setFeedbackid(String Feedbackid) {
        feedbackID = Feedbackid;
    }
    
    public void setRating(String Rating) {
        rating = Rating;
    }
    
    public void setDescription(String Description) {
        description = Description;
    }
    
    public void setFeedbackUser(String FeedbackUser) {
        feedbackUser = FeedbackUser;
    }
    
    //cannot submit empty feedback
    public boolean EmptyFeedback() {
        return rating.equals("")||description.equals("");
    }
    
    public boolean UserNotFound() {
        return feedbackUser.equals("");
    }
    
    //save feedback into textfile
    public void SaveFeedback() {
        File Finput = new File("Feedback.txt");
        try{
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            //Store the data into data base
            String Line = feedbackID + "," + rating + "," + description + ","+ feedbackUser;
            //in the textfile, each data will have one row blank b4 next line
            //use pw to write data you want to write
            pw.write(Line);
            bw.newLine();
            pw.close();
            System.out.println("Data Written.txt");
        } catch (IOException ex) {
             ex.toString();
        }
    }
}
