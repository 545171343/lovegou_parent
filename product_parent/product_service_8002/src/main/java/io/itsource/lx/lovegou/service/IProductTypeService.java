package io.itsource.lx.lovegou.service;

import io.itsource.lx.lovegou.domain.ProductType;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author lx
 * @since 2019-01-17
 */
public interface IProductTypeService extends IService<ProductType> {
    List<ProductType> treeData();
}
