package simplefm.user;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMap implements RowMapper {

    public User mapRow(ResultSet rs, int rownum) throws SQLException {
        User user = new User();

        user.setUid(rs.getInt("uid"));

        user.setBrief(rs.getString("brief"));
        return user;
    }

    public int[] getRowsForPaths(TreePath[] path) {
        return new int[0];
    }
}
