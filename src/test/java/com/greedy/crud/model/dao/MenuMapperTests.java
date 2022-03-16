package com.greedy.crud.model.dao;

import com.greedy.crud.config.CrudApplication;
import com.greedy.crud.config.MybatisConfig;
import com.greedy.crud.model.dto.MenuDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {CrudApplication.class, MybatisConfig.class})
public class MenuMapperTests {

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void 메퍼_인터페이스_의존성_주입_테스트() {

        assertNotNull(menuMapper);
        System.out.println("menuMapper = " + menuMapper);
    }

    @Test
    public void 전체_메뉴_조회용_매퍼_테스트() {
        //given

        //when
        List<MenuDTO> menuList = menuMapper.findAllMenu();
        //then
       assertNotNull(menuList);

       menuList.stream().forEach(System.out::println);



    }

}
