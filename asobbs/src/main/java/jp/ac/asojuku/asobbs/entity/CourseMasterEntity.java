package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学科マスター モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity 
@Table(name="COURSE_MASTER")
public class CourseMasterEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** COURSE_ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;

	/** COURSE_NAME. */
	private String courseName;


	/**
	 * コンストラクタ.
	 */
	public CourseMasterEntity() {
	}

	/**
	 * COURSE_ID を設定します.
	 * 
	 * @param courseId
	 *            COURSE_ID
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	/**
	 * COURSE_ID を取得します.
	 * 
	 * @return COURSE_ID
	 */
	public Integer getCourseId() {
		return this.courseId;
	}

	/**
	 * COURSE_NAME を設定します.
	 * 
	 * @param courseName
	 *            COURSE_NAME
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * COURSE_NAME を取得します.
	 * 
	 * @return COURSE_NAME
	 */
	public String getCourseName() {
		return this.courseName;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CourseMasterEntity other = (CourseMasterEntity) obj;
		if (courseId == null) {
			if (other.courseId != null) {
				return false;
			}
		} else if (!courseId.equals(other.courseId)) {
			return false;
		}
		return true;
	}

}