package ldg.mybatis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentJdbcRepository;
import ldg.mybatis.repository.mapper.CommentMapperRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {
	@Autowired
	private CommentMapperRepository commentRepository;
	@Autowired
	private CommentJdbcRepository commentJdbcRepository;

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

	@Transactional
	@SuppressWarnings("unused")
	public Integer withSpringJdbc(Comment comment) {
		Long commentNo = comment.getCommentNo();

		commentJdbcRepository.selectCommentByPrimaryKey(commentNo);
		commentJdbcRepository.deleteComment(commentNo);
		if (true) {
			throw new IllegalStateException("rollback test");
		}
		return commentRepository.insertComment(comment);
	}
}