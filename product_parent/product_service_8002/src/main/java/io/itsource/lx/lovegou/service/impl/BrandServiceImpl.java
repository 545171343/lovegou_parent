package io.itsource.lx.lovegou.service.impl;

import io.itsource.lx.lovegou.domain.Brand;
import io.itsource.lx.lovegou.mapper.BrandMapper;
import io.itsource.lx.lovegou.service.IBrandService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author lx
 * @since 2019-01-17
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
