package io.itsource.lx.lovegou.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.itsource.lx.lovegou.domain.Brand;
import io.itsource.lx.lovegou.mapper.BrandMapper;
import io.itsource.lx.lovegou.query.BrandQuery;
import io.itsource.lx.lovegou.service.IBrandService;
import io.itsource.lx.lovegou.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    private  BrandMapper brandMapper;
    @Override
    public PageList<Brand> selectPageList(BrandQuery query) {
       Page<Brand> page = new Page<>(query.getPage(),query.getRows());
        List<Brand> rows = brandMapper.selectPageList(page, query);
        long total = page.getTotal();
        return new PageList<>(total,rows );
    }
}
