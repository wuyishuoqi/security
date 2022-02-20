package com.dielian.demo.dao;


import com.dielian.demo.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface MenuMapper {
    List<Menu> getAllMenus();
}
