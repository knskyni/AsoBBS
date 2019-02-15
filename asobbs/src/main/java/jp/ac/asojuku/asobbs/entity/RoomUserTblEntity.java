package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * ルームユーザーテーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Data
@Entity 
@Table(name="ROOM_USER_TBL")
@IdClass(RoomUserTblId.class)
public class RoomUserTblEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ルームテーブル. */
	@Id
	private Integer roomId;

	/** ユーザーテーブル. */
	@Id
	private Integer userId;
	


	/** ルームテーブル. */
//	@ManyToOne
 //   @JoinColumn(referencedColumnName="roomId",insertable=false ,updatable=false)
//	private RoomTblEntity roomTbl;

	/** ユーザーテーブル. */
//	@OneToOne
//    @JoinColumn(name="userId",insertable=false ,updatable=false)
//	private UserTblEntity userTbl;

	/** ロール. */
	private Integer roomRole;

	/**
	 * コンストラクタ.
	 */
	public RoomUserTblEntity() {
	}


}
