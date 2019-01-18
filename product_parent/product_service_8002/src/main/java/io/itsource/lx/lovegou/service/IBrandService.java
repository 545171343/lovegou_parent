package io.itsource.lx.lovegou.service;

import io.itsource.lx.lovegou.domain.Brand;
import com.baomidou.mybatisplus.service.IService;
import io.itsource.lx.lovegou.query.BrandQuery;
import io.itsource.lx.lovegou.util.PageList;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author lx
 * @since 2019-01-17
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> selectPageList(BrandQuery query);
}
