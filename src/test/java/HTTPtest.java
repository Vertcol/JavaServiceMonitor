import org.example.utility.HTTPrequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HTTPtest {
    @Test
    public void http() {
        HTTPrequest request1 = new HTTPrequest("http://google.com");
        Assertions.assertTrue(request1.execute());

        HTTPrequest request2 = new HTTPrequest("http://17908293.com");
        Assertions.assertFalse(request2.execute());

        HTTPrequest request3 = new HTTPrequest("https://hytale.com/");
        Assertions.assertTrue(request3.execute());
    }
}
