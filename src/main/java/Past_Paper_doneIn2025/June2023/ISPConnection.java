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

        return "";
    }//disDate

}//class

