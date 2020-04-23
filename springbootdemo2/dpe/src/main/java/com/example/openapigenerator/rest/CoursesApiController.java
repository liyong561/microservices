package com.example.openapigenerator.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-03T22:20:10.567+08:00[Asia/Shanghai]")

@Controller
@RequestMapping("${openapi.xxxxAPI.base-path:/v1}")
public class CoursesApiController implements CoursesApi {

    private final CoursesApiDelegate delegate;

    public CoursesApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CoursesApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CoursesApiDelegate() {});
    }

    @Override
    public CoursesApiDelegate getDelegate() {
        return delegate;
    }

}
