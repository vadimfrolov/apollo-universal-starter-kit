package com.sysgears.post.dto.input;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class AddCommentInput {
    @NonNull
    private final Integer postId;
    @NonNull
    private final String content;
}