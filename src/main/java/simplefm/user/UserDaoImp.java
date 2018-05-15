package simplefm.user;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import javax.sql.DataSource;
import java.util.List;

public class UserDaoImp implements UserDao {

    private DataSource datasource;
    private JdbcTemplate jdbcTemplateObject;


    public void setdatasource(DataSource ds) {
        this.datasource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(datasource);
    }
    public List<User> allUsers() {


        List<User> users = null;
        String sql = "SELECT * FROM sfm.user";
        users = jdbcTemplateObject.query(sql, (ResultSetExtractor<List<User>>) new UserMap());
        return users;

    }
}
