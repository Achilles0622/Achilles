package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/dish")
@Api(tags = "菜品")
@Slf4j
public class DishController {
    @Autowired
    private DishService dishService;
    @PostMapping
    @ApiOperation("新增")
    public Result save(@RequestBody DishDTO dishDTO) {
        log.info("新增");
        dishService.saveWithFlavor(dishDTO);
        return Result.success();
    }
    @GetMapping("/page")
    @ApiOperation("123")
    public Result<PageResult>page(DishPageQueryDTO dishPageQueryDTO){
        log.info("123:{}",dishPageQueryDTO);
       PageResult pageResult= dishService.pageQuery(dishPageQueryDTO);
       return Result.success(pageResult);
    }
}
