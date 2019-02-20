package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

/**
 * 新規テーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity 
@Table(name="ATTACHED_FILE_TBL")
@Data
public class AttachedFileTblEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 添付ファイルID. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer attachedFileId;

	/** 掲示板テーブル. */
	private Integer bbsId;

	/** ファイルパス. */
	private String filePath;

	/** ファイルサイズ. */
	private Long fileSize;
	
	/**
	 * コンストラクタ.
	 */
	public AttachedFileTblEntity() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachedFileId == null) ? 0 : attachedFileId.hashCode());
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
		AttachedFileTblEntity other = (AttachedFileTblEntity) obj;
		if (attachedFileId == null) {
			if (other.attachedFileId != null) {
				return false;
			}
		} else if (!attachedFileId.equals(other.attachedFileId)) {
			return false;
		}
		return true;
	}

}
