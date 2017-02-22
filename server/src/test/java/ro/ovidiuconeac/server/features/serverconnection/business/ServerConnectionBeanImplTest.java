package ro.ovidiuconeac.server.features.serverconnection.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.models.features.serverconnection.ServerConnection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/19/17.
 */
public class ServerConnectionBeanImplTest {

    private ServerConnectionBean serverConnectionBean;

    @Before
    public void setUp() {
        serverConnectionBean = mock(ServerConnectionBean.class);
    }

    @After
    public void tearDown() {
        serverConnectionBean = null;
    }

    @Test
    public void getServerConnection() {
        ServerConnection serverConnection = new ServerConnection("http", "localhost","1984");
        when(serverConnectionBean.getServerConnection()).thenReturn(serverConnection);
        ServerConnection result = serverConnectionBean.getServerConnection();
        assertNotNull(result);
        assertEquals("http", result.getScheme());
        assertEquals("localhost", result.getHost());
        assertEquals("1984", result.getPort());
    }
}
