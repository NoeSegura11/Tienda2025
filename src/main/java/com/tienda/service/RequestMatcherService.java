package com.tienda.service;

import com.tienda.domain.RequestMatcher;
import java.util.List;


public interface RequestMatcherService {

    public List<RequestMatcher> getAllRequestMatchers();

    public RequestMatcher getRequestMatcher(RequestMatcher requestMatcher);

    public void save(RequestMatcher requestMatcher);

    public void delete(RequestMatcher requestMatcher);

}
