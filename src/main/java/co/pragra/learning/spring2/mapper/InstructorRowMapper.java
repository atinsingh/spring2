package co.pragra.learning.spring2.mapper;

import co.pragra.learning.spring2.domain.Instructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstructorRowMapper implements RowMapper<Instructor> {

    @Override
    public Instructor mapRow(ResultSet resultSet, int i) throws SQLException {
        Instructor ins = new Instructor();
        ins.setId(resultSet.getLong("id"));
        ins.setName(resultSet.getString("name"));
        ins.setDescription(resultSet.getString("descripton"));
        return ins;
    }
}
