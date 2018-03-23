package playground.starters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import playground.database.accessors.DataBaseAccessor;

import javax.annotation.PostConstruct;

@Component
public class TestStarter {
    @Autowired
    private DataBaseAccessor accessor;

    @PostConstruct
    public void init() {
        // TODO: Create entities and use the accessor to save to the database

    }
}
