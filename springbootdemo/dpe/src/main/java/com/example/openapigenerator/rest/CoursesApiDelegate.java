package com.example.openapigenerator.rest;

import com.example.openapigenerator.rest.dto.CreateCourseRequest;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CoursesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-03T22:20:10.567+08:00[Asia/Shanghai]")

public interface CoursesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * @see CoursesApi#createCourse
     */
    default ResponseEntity<CreateCourseRequest> createCourse(CreateCourseRequest createCourseRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"cover\" : \"cover\",  \"homepageRef\" : 5,  \"albumRef\" : 1,  \"price\" : 0.80082819046101150206595775671303272247314453125,  \"presenterRef\" : 6,  \"shortDesc\" : \"shortDesc\",  \"title\" : \"title\",  \"poster\" : \"poster\",  \"status\" : \"underReview\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
