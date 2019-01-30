package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * ルームユーザーテーブル composite-id クラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Embeddable
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

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


}