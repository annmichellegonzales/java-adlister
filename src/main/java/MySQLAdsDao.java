import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;

    public MySQLAdsDao(Config config) {
    }

        @Override
        public List<Ad> all () {
            return null;
        }
    }
