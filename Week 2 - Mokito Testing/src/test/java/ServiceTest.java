import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ServiceTest {
    @Test
    void testdata()
    {
        ExternalApi e= mock(ExternalApi.class);
        when(e.fetchData()).thenReturn("Mock Data");
        Service s=new Service(e);
        String ans=s.getData();
        assertEquals("Mock Data",ans);
    }
    @Test
    void testverify()
    {
        ExternalApi e = mock(ExternalApi.class);
        when(e.fetchData()).thenReturn("Mock");
        Service s= new Service(e);
        String ans=s.getData();
        verify(e).fetchData();
    }
}