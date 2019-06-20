package demo.service.impl;

import demo.dao.GundamUserDao;
import demo.entity.GundamUser;
import demo.util.PageQuery;
import demo.service.GundamUserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author allen
 * @date 2019/6/19 14:00
 **/
@Service
public class GundamUserServiceImpl implements GundamUserService {

    @Resource
    private GundamUserDao gundamUserDao;

    @Override
    public void save(GundamUser user) {
        gundamUserDao.save(user);
    }

    @Override
    public void delete(GundamUser user) {
        gundamUserDao.delete(user);
    }

    @Override
    public List<GundamUser> findAll() {
        return gundamUserDao.findAll();
    }

    @Override
    public Object findPage(PageQuery pageQuery) {
        return gundamUserDao.findAll(new PageRequest(pageQuery.getPage(), pageQuery.getSize()));
    }
}