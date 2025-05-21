/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Paper_doneIn2025.June2023;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class ISPConnection {

    //ISP Connection Class
    private String ip;
    private String clientID;
    private String isp;
    private String date;

    public ISPConnection(String i, String cid, String isp, String d) {
        this.ip = i;
        this.clientID = cid;
        this.isp = isp;
        this.date = d;

    }//construct
// accessor = get

    public String getIp() {
        return ip;
    }

    public String getClientID() {
        return clientID;
    }

    public String getIsp() {
        return isp;
    }

    public String getDate() {
        return date;
    }

    // mutator = set
    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean validIP() {
        Scanner scIP = new Scanner(ip).useDelimiter("\\.");
        boolean ans = true;
        while (scIP.hasNext()) {
            int next = scIP.nextInt();

            if (next > 255 && next < 0) {
                ans = false;
            }//ifFALSE

        }//while
        return ans;
    }//vIP

    public String displayDate() {
        // dd/mm/yy to year-monthinwords-day
        Scanner scDate = new Scanner(date).useDelimiter("\\/");
        String word = " ";
        int day = scDate.nextInt();
        String month = scDate.next();
        int year = scDate.nextInt();
        
//        int month = sc.nextInt() - 1;
//        String[] months = {"Jan", "Feb"};
//        String monthName = months[month];

        switch (month) {
            case "01":
                word = "January";
                break;
            case "02":
                word = "February";
                break;
            case "03":
                word = "March";
                break;
            case "04":
                word = "April";
                break;
            case "05":
                word = "May";
                break;
            case "06":
                word = "June";
                break;
            case "07":
                word = "July";
                break;
            case "08":
                word = "August";
                break;
            case "09":
                word = "September";
                break;
            case "10":
                word = "October";
                break;
            case "11":
                word = "November";
                break;
            case "12":
                word = "December";
                break;

        }// switch

        return word;
    }//disDate

}//class

