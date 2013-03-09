package client;

import junit.framework.TestCase;
import org.oasisopen.sca.annotation.Reference;
import org.oasisopen.sca.test.Service;

/**
 *
 */
public class SPR40009Client extends TestCase {
    private static final String EXPECTED = "ServiceImpl1.testIt request";

    @Reference
    protected Service invocation;

    public void testInvoke() throws Exception {
        assertEquals(EXPECTED, invocation.testIt("request"));
    }
}
