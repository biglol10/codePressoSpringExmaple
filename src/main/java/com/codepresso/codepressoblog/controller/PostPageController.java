package com.codepresso.codepressoblog.controller;

import com.codepresso.codepressoblog.controller.dto.CommentResponseDto;
import com.codepresso.codepressoblog.service.CommentService;
import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Comment;
import com.codepresso.codepressoblog.vo.Post;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Controller
public class PostPageController {

    private PostService postService;
    private CommentService commentService;

    @RequestMapping("/post/{id}")
    public String getPostDetailPage(Model model, @PathVariable Integer id) {
        Post post = postService.getPostById(id);

        List<Comment> comments = commentService.getCommentListByPostIdAndPage(id, 1, 3);
        List<CommentResponseDto> commentResponseDtos = new ArrayList<>();
        for(Comment comment : comments) {
            commentResponseDtos.add(new CommentResponseDto(comment));
        }

        Integer commentCount = commentService.getCommentCountByPostId(id);


        model.addAttribute("post", post);
        model.addAttribute("commentCount", commentCount);
        model.addAttribute("comments", commentResponseDtos);
        return "post_datail";
    }

    @RequestMapping("/post/create")
    public String getPostCreatePage() {
        return "post_write";
    }

    @RequestMapping("/post/edit/{id}")
    public String getPostCreatePage(Model model, @PathVariable Integer id) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "post_edit";
    }
}
