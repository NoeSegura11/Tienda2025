package com.tienda.service.impl;

import com.tienda.dao.RequestMatcherDao;
import com.tienda.domain.RequestMatcher;
import com.tienda.service.RequestMatcherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestMatcherServiceImpl implements RequestMatcherService {

    @Autowired
    RequestMatcherDao requestMatcherDao;

    @Override
    public List<RequestMatcher> getAllRequestMatchers() {
        return requestMatcherDao.findAll();
    }

    @Override
    public RequestMatcher getRequestMatcher(RequestMatcher requestMatcher) {
        return requestMatcherDao.findById(requestMatcher.getIdRequestMatcher()).orElse(null);
    }

    @Override
    public void save(RequestMatcher requestMatcher) {
        requestMatcherDao.save(requestMatcher);
    }

    @Override
    public void delete(RequestMatcher requestMatcher) {
        requestMatcherDao.delete(requestMatcher);
    }

}