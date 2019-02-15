package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

/**
 * ルームユーザーテーブル composite-id クラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Data
public class RoomUserTblId implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ルームテーブル. */
	private Integer roomId;

	/** ユーザーテーブル. */
	private Integer userId;

	/**
	 * コンストラクタ.
	 */
	public RoomUserTblId() {
	}

}
