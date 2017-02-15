package ro.ovidiuconeac.server.features.ipv4address.presentation;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.ipv4address.Ip;
import ro.ovidiuconeac.server.features.ipv4address.business.IpBean;

@RestController
public class IpController {

    @Autowired
    private IpBean ipBean;

    @RequestMapping("/ipv4address/ip")
    public Ip getIPv4Address() {
        return ipBean.getIPv4Address();
    }
}