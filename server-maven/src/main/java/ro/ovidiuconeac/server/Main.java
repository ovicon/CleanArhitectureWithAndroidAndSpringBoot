package ro.ovidiuconeac.server;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);

        } catch (UnknownHostException e) {

            e.printStackTrace();
        }
    }
}
