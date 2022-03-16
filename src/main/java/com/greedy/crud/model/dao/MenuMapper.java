package com.greedy.crud.model.dao;

import com.greedy.crud.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuDTO> findAllMenu();
}