package ro.ovidiuconeac.server.features.ipv4address.business;

import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.ipv4address.Ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
@Component
public class IpBeanImpl implements IpBean {
    
    @Override
    public Ip getIPv4Address() {
        InetAddress ip = null;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);

        } catch (UnknownHostException e) {

            e.printStackTrace();
        }
        return new Ip(ip.getHostAddress().toString());
    }
}