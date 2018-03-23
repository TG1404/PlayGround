package playground.starters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import playground.database.accessors.DataBaseAccessorImpl;

@Component
public class TestStarter {
    @Autowired
    private DataBaseAccessorImpl accessor;


}
