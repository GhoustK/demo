package com.boss.demo.mapper;

import com.boss.demo.domain.Remark;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface RemarkMapper {

    @Insert("INSERT INTO remark(uid, or_id, created_at, updated_at, deleted_at, content) VALUE(" +
            "#(uid), #(or_id), #(created_at), #(updated_at), $(deleted_at), #(content))")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "r_id")
    int insert(Remark remark);
}
