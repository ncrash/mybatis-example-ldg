package kr.pe.ldg.mybatis.example1.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapperRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {
	@Autowired
	private CommentMapperRepository commentRepository;

	public List<Comment> selectComment(Long commentNo) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);

		return commentRepository.selectCommentByCondition(condition);
	}

	@Transactional
	public Integer insertComment(Comment comment) {
		return commentRepository.insertComment(comment);
	}

	@Transactional
	public Integer deleteComment(Long commentNo) {
		return commentRepository.deleteComment(commentNo);
	}
}