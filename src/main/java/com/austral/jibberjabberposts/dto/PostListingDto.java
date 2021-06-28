package com.austral.jibberjabberposts.dto;

import com.austral.jibberjabberposts.model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostListingDto {

    List<PostInfoDto> posts;

}
