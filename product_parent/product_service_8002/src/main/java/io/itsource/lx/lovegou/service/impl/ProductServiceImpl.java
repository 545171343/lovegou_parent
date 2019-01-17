package io.itsource.lx.lovegou.service.impl;

import io.itsource.lx.lovegou.domain.Product;
import io.itsource.lx.lovegou.mapper.ProductMapper;
import io.itsource.lx.lovegou.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author lx
 * @since 2019-01-17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
