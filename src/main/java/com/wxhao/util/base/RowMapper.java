package com.wxhao.util.base;

import java.sql.ResultSet;
import java.sql.SQLException;
 
/**
 * RowMapper
 * @author wxhao
 * @version v1.0
 */
public interface RowMapper
{
    public Object mapRow(ResultSet rs, int index)
        throws SQLException;
}