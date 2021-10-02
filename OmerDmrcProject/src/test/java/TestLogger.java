import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestLogger implements TestWatcher {

    Log log=new Log();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName=context.getDisplayName();
        log.info(testName+"passed");
    }



    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName=context.getDisplayName();
        String testFailedCause=cause.getMessage();
        log.error(testName+"failed"+"because"+testFailedCause);
    }
}
