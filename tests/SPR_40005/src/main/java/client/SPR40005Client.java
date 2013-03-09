package client;

import junit.framework.TestCase;
import org.oasisopen.sca.annotation.Reference;
import test.Service;

/**
 *
 */
public class SPR40005Client extends TestCase {
    private static final String EXPECTED = "RefImpl1 request";

    @Reference
    protected Service invocation;

    public void testInvoke() throws Exception {
        assertEquals(EXPECTED, invocation.testIt("request"));
    }
}
