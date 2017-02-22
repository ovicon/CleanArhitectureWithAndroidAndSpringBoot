package ro.ovidiuconeac.server.features.serverconnection.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.models.features.serverconnection.ServerConnection;
import ro.ovidiuconeac.server.features.serverconnection.business.ServerConnectionBean;

@RestController
public class ServerConnectionController {

    private final ServerConnectionBean serverConnectionBean;

    // Better for testing
    @Autowired
    public ServerConnectionController(ServerConnectionBean serverConnectionBean) {
        this.serverConnectionBean = serverConnectionBean;
    }

    @RequestMapping("/serverconnection")
    public ServerConnection getIPv4Address() {
        return serverConnectionBean.getServerConnection();
    }
}