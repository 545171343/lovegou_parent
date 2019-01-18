package io.itsource.lx.lovegou.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import io.itsource.lx.lovegou.domain.Brand;
import io.itsource.lx.lovegou.query.BrandQuery;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author lx
 * @since 2019-01-17
 */
public interface BrandMapper extends BaseMapper<Brand> {

    List<Brand> selectPageList(Page<Brand>page, BrandQuery query);
}
