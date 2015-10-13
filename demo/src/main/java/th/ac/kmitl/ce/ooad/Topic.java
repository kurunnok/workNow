package th.ac.kmitl.ce.ooad;

import java.util.Date;

/**
 * Created by Administrator on 12/10/2558.
 */
public class Topic {
    private String nameTitle;
    private String description;
    private Date date;
    private long time;
    private String type;
    private double rate;
    private  int topicID;

    public Topic (String nameTitle,String description,Date date,long time, String type,double rate){
        this.nameTitle=nameTitle;
        this.description=description;
        this.date=date;
        this.time=time;
        this.type=type;
        this.rate=rate;
    }


    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }
}
