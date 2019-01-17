package io.itsource.lx.lovegou.service.impl;

import io.itsource.lx.lovegou.domain.ProductType;
import io.itsource.lx.lovegou.mapper.ProductTypeMapper;
import io.itsource.lx.lovegou.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author lx
 * @since 2019-01-17
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
