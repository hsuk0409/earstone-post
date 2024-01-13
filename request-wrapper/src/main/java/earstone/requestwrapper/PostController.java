package earstone.requestwrapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    @PostMapping(value = "/post")
    public Long savePost(@RequestBody PostDto postDto) {
        final Long id = 1L;
        log.info("request Post data: {}", postDto.toString());

        return id;
    }

}
