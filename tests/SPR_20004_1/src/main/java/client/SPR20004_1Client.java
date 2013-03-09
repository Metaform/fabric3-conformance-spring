package client;

import junit.framework.TestCase;
import org.oasisopen.sca.annotation.Reference;
import test.Service;

/**
 *
 */
public class SPR20004_1Client extends TestCase {
    private static final String EXPECTED = "ServiceImpl1 RefImpl1 request";

    @Reference
    protected Service invocation;

    public void testInvoke() throws Exception {
        assertEquals(EXPECTED, invocation.testIt("request"));
    }
}
