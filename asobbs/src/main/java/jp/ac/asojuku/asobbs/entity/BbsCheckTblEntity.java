package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * 掲示板確認テーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity 
@Table(name="BBS_CHECK_TBL")
@IdClass(BbsCheckTblId.class)
@Data
public class BbsCheckTblEntity implements Serializable {
	

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 掲示板テーブル. */
	@Id
	private Integer bbsId;

	/** ユーザーID. */
	@Id
	private Integer userId;

	/** 掲示板テーブル. */
	@OneToOne
    @JoinColumn(name="bbsId",insertable=false ,updatable=false)
	private BbsTblEntity bbsTbl;

	@OneToOne
    @JoinColumn(name="userId",insertable=false ,updatable=false)
	private UserTblEntity userTbl;

	/** 確認日時. */
	private Date checkDate;

	/**
	 * コンストラクタ.
	 */
	public BbsCheckTblEntity() {
	}


}
